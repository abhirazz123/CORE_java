package OCt_28.Encapsulation.method_return_type;
import java.util.*;
public class Book {
	private String BookTitale;
	private String authorName;
	
	public Book(String BookTitale, String authorName) {
		this.BookTitale = BookTitale;
		this.authorName = authorName;
	}
	public String toString() {
		return "Book [ Book Titale = " +BookTitale +"Author Name = "+authorName+ "]";
	}
	public static Book getBookObject() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Book Titale : ");
		String  BookTitale = sc.nextLine();
		
		System.out.println("Enter the Author Name : ");
		String authorName = sc.nextLine();
		
		return new Book(BookTitale, authorName);
		
	}
	
}


