package OCt_22.OOPs;
import java.util.*;
public class StudentDemo {

	public static void main(String[] args) {
		Student abhi = new Student();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Student name:-");
		abhi.Studentname = sc.nextLine();		
		//sc.nextLine();
		System.out.println("Enter the School name:-");
		abhi.StudentSchoolNme = sc.nextLine();
				
		System.out.println("Enter the class:- ");
		abhi.Studentclasss = sc.nextInt();
				sc.nextLine();
		System.out.println("Enter the Branch name:-");
		abhi.Studentbranch = sc.nextLine();
				
		System.out.println("Enter the School Roll no:-");
		abhi.Studentrollno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the School fees no:-");
		abhi.Studentfess = sc.nextDouble();	
		abhi.getStudentDetlies();
		abhi.function();
		
		

	}

}
