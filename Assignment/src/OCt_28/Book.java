package OCt_28;

public class Book {
	
	private String Titale;
	private String Author;
	private double price;
	
	public Book(String Titale, String Author, double price) {
		this.Titale = Titale;
		this.Author = Author;
		this.price = price;
		
	}
	public void printDetails() {
		 System.out.println("Title: " + Titale);
	        System.out.println("Author: " + Titale);
	        System.out.println("Price: " + price);
	}
	public void applyDiscount(double discountPercentage ) {
		if(discountPercentage<0) {
			  System.out.println("Error: Invalid discount percentage.");
		}
		else {
			double discountAmount = (discountPercentage/100)*price;
			price -=discountAmount;
		}
	}
}
