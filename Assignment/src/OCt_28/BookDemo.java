package OCt_28;
import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Book Titale: ");
		String Titale = sc.nextLine();
		
		System.out.println("Enter the Book Author Name: ");
		String Author = sc.nextLine();
		
		
		System.out.println("Enter the Book price: ");
		double price = sc.nextDouble();
		
		
		
		Book book = new Book(Author, Author, price);
		 System.out.println("Applying a 10% discount...");
		book.applyDiscount(10);
		book.printDetails();
	}

}
