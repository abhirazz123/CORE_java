package DEC_24.exception;

import java.util.InputMismatchException;
import java.util.*;
public class SpecificException {

	public static void main(String[] args) {
		 System.out.println("Main method Startd");
		 Scanner sc = new Scanner (System.in);
		 
		 try {
			 System.out.println("Enter your Roll : ");
			 int roll = sc.nextInt();
			 
			 System.out.println("Your Roll No : "+roll);
		 }
		 catch(Exception e ) {
			 e.printStackTrace();
		 }
		 sc.close();
		 System.out.println("Main ended");
	}

}
