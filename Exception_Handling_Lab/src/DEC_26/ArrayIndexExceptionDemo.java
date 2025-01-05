package DEC_26;
import java.util.*;

public class ArrayIndexExceptionDemo {

	public static void main(String[] args) {
		 System.out.println("Main method Start");
		 Scanner sc = new Scanner(System.in) ;
		 
		 try {
			 System.out.println("integer numbers (A) : ");
			 int A =  sc.nextInt();
			 
			 System.out.println("integer numbers (B) : ");
			 int B = sc.nextInt();
			 
			 System.out.println("A : "+A);
			 System.out.println("B : "+B);
		 }
		 catch(InputMismatchException e) {
			 
			 e.getMessage();
			 e.printStackTrace();
			 e.toString();
			 
		 }
	}

}
