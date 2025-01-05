package OCT_19.Reference_Variable;
import java.util.Scanner;

class Student
{	
	Student S1 = null;
	Scanner sc = new Scanner (System.in);
	public static void accpat(Student sc ) {
		Student s2 = new Student();
		System.out.println("Radhe radhe ");
	
	}
}

public class ReferenceVariable {

	public static void main(String[] args) 
	{
		Student student = new Student();
		Student.accpat(student);

	}

}
