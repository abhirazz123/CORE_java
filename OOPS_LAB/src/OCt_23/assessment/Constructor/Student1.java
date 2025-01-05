package OCt_23.assessment.Constructor;
import java.util.*;
public class Student1{
	String StudentCollageName;
	String CollageAdd;
	String studentName;
	int studenId;
	double collagefee;
	int attendance;
	int marks;

	public void setstudentdata() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Student Collage Name:");
		 StudentCollageName = sc.nextLine();
		
		System.out.println("Enter the  Collage Address");
		 CollageAdd = sc.nextLine();
		
		System.out.println("Enter the student Name:");
		 studentName= sc.nextLine();
		
		System.out.println("Enter the studen Id:");
		 studenId = sc.nextInt();
		
		System.out.println("Enter the collage fees:");
		 collagefee= sc.nextDouble();	
		
		System.out.println("Enter the attendance:");
		 attendance = sc.nextInt();
		
		System.out.println("Enter the marks:");
		 marks = sc.nextInt();
		sc.close();
		
		
		}
	public void getstudentdata() {
		System.out.println("Student Collage  Name:"+StudentCollageName);
		System.out.println("Collage Address:"+CollageAdd);
		System.out.println("student Name:"+studentName);
		System.out.println("studen Id"+studenId);
		System.out.println("collage fess:" +collagefee);
		System.out.println("attendance:"+attendance+"%");
		System.out.println("marks:"+marks);
	}
	public static void main(String[] args) {
		Student1 abhi = new Student1();
		abhi.getstudentdata();
		abhi.getstudentdata();
	}
	
}
