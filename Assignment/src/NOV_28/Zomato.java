package NOV_28;

public class Zomato {

	public static void main(String[] args) {
		Order or = new Order(144, "Biryani", 250);
		Customer cust = new Customer(1007, "Abhishek", "HYD", or);
		System.out.println(cust);

	}

}
