package OCt_28.Encapsulation.method_return_type;
import java.util.*;
public class BookDemo {
	public static void main(String[] args) {
		
		Scanner  sc = new Scanner (System.in);
		System.out.println("How many Objects:");
		int noOfObj  = sc.nextInt();
		
		for (int i = 1; i<=noOfObj ;i++) {
			Book object = Book.getBookObject();
			System.out.println(object);
		}
		
	} 

}
