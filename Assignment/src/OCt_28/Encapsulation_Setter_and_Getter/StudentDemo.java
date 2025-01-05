package OCt_28.Encapsulation_Setter_and_Getter;
import java.util.*;
public class StudentDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the student Id: ");
		int studentId = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Student Name: ");
		String studentName = sc.nextLine();
		
		System.out.println("Enter the Student Marks: ");
		int studentMarks = sc.nextInt ();
		sc.nextLine();
		
		System.out.println("Enter the student Address: ");
		String studentAddress = sc.nextLine();
		
		Student std = new Student(studentMarks, studentAddress, studentMarks, studentAddress);
		
		System.out.println(std);
		if(std.getStudentMarks()>90) {
			System.out.println("is Excellent in Subject");
			
		}else if(std.getStudentMarks()>=75) {
			System.out.println("is very good  in Subject");
		}else {
			System.out.println("is good in Subject");
		}
		
	}
	

	
}