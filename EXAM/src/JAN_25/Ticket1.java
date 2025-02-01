package JAN_25;

public class Ticket1 {
	/***
	 * 
/**
 * 
1)Question: Online Ticket Booking System with Multithreading
You are tasked with developing an Online Ticket Booking System in Java, incorporating multithreading to improve system responsiveness and handle multiple ticket bookings concurrently. The system should ensure proper synchronization to prevent overselling tickets and handle simultaneous user bookings efficiently.

Requirements
Ticket Class:

Create a Ticket class representing a ticket with a unique ticket ID.
Each ticket is associated with a specific show, and a fixed number of tickets are available per show.
Show Class:

Create a Show class representing a show with the following attributes:
A unique show ID.
A title.
The total number of available tickets.
Implement methods to:
Check ticket availability.
Book a ticket, reducing the number of available tickets by one.
Ensure the booking process is thread-safe to avoid overselling tickets.
User Class:

Create a User class representing a user attempting to book tickets.
Each user can book tickets for only one show at a time.
TicketBookingSystem Class:

Create a TicketBookingSystem class to manage the booking process.
Implement a bookTicket(User user, Show show) method that:
Checks if tickets are available for the requested show.
Books a ticket for the user if available and displays a success message.
Displays an error message if tickets are sold out for the requested show.
Main Application:

Simulate the ticket booking system with three shows:

Movie A: 3 available tickets.
Movie B: 2 available tickets.
Movie C: 1 available ticket.
Five users (Alice, Bob, Charlie, Diana, and Eve) try to book tickets simultaneously for different shows:

Alice wants to book a ticket for Movie A.
Bob wants to book a ticket for Movie B.
Charlie wants to book a ticket for Movie A.
Diana wants to book a ticket for Movie C.
Eve wants to book a ticket for Movie B.
Use multithreading to allow simultaneous booking attempts.

Ensure that no tickets are oversold and appropriate messages are displayed for each booking attempt.
 * */

 


}
