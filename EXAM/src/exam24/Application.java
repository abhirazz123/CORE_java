package exam24;

class Ticket {
	private static int idCounter = 0;
	private int ticketId;
	private String showId;

	public Ticket(String showId) {
		this.ticketId = ++idCounter;
		this.showId = showId;
	}

	public int getTicketId() {
		return ticketId;
	}

	public String getShowId() {
		return showId;
	}
}

class Show {
	private String showId;
	private String title;
	private int availableTickets;

	public Show(String showId, String title, int availableTickets) {
		this.showId = showId;
		this.title = title;
		this.availableTickets = availableTickets;
	}

	public synchronized boolean bookTicket() {
		if (availableTickets > 0) {
			availableTickets--;
			return true;
		}
		return false;
	}

	public String getShowId() {
		return showId;
	}

	public String getTitle() {
		return title;
	}

	public int getAvailableTickets() {
		return availableTickets;
	}
}

class User implements Runnable {
	private String name;
	private Show show;
	private TicketBookingSystem bookingSystem;

	public User(String name, Show show, TicketBookingSystem bookingSystem) {
		this.name = name;
		this.show = show;
		this.bookingSystem = bookingSystem;
	}

	@Override
	public void run() {
		bookingSystem.bookTicket(this, show);
	}

	public String getName() {
		return name;
	}
}

class TicketBookingSystem {
	public void bookTicket(User user, Show show) {
		synchronized (show) {
			if (show.bookTicket()) {
				System.out.println("Success: " + user.getName() + " booked a ticket for " + show.getTitle());
			} else {
				System.out.println("Error: Tickets for " + show.getTitle() + " are sold out.");
			}
		}
	}
}

public class Application {
	public static void main(String[] args) {
		Show movieA = new Show("1", "Movie A", 3);
		Show movieB = new Show("2", "Movie B", 2);
		Show movieC = new Show("3", "Movie C", 1);

		TicketBookingSystem bookingSystem = new TicketBookingSystem();

		User alice = new User("Alice", movieA, bookingSystem);
		User bob = new User("Bob", movieB, bookingSystem);
		User charlie = new User("Charlie", movieA, bookingSystem);
		User diana = new User("Diana", movieC, bookingSystem);
		User eve = new User("Eve", movieB, bookingSystem);

		Thread t1 = new Thread(alice);
		Thread t2 = new Thread(bob);
		Thread t3 = new Thread(charlie);
		Thread t4 = new Thread(diana);
		Thread t5 = new Thread(eve);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}