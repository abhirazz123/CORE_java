package OCT_19.BLC_and_ELC_class;
import java.util.*;
public class Student {
	public static void main(String []args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Roll : ");
		int roll = sc.nextInt();
		System.out.println("Enter the name: ");
		String name = sc.next();
		System.out.println("Enter the Fees:");
		double fess = sc.nextDouble();
		System.out.println(Studentdemo.getsudentDtails(roll, name, fess));
		
		
		
		
		
		
	}

}
