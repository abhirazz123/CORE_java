package OCt_23;
import java.util.*;
public class EmployeeDemo {
	public static void main(String[] args) 
	{
		Employee abhi = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the First Name: ");
		String firstName = sc.nextLine();
		
		System.out.println("Enter the Last Name: ");
		 String lastName = sc.nextLine();
		 
		 System.out.println("Enter the employee Id: ");
		 int employeeId = sc.nextInt();
		 
		 System.out.println("Enter the salary: ");
		 double salary = sc.nextDouble();
		 
		 System.out.println("Enter the no Of Project: ");
		 int noOfProject = sc.nextInt();
		 
		 abhi.setEmployeeData(firstName, lastName, employeeId, salary, noOfProject);
		 abhi.calculateSalary();
		 abhi.displayDetails();
	}
	
	
	
}
