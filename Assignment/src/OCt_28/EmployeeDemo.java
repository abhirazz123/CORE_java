package OCt_28;
import java.util.*;
public class EmployeeDemo {
public static void main(String[] args) {
	;
	Scanner sc = new Scanner (System.in);
	
	System.out.print("Enter the First Name: ");
	String FirstName = sc.nextLine();
	
	System.out.println("Entre the Last Name:");
	String LastName = sc.nextLine();
	
	System.out.println("Enter the employee Id: ");
	int employeeId = sc.nextInt();
	
	System.out.println("Enter the salary:");
	double salary = sc.nextInt();
	
	System.out.println("Enter the No Of Project: ");
	int NoOfProject = sc.nextInt();
	Employee emp = new Employee(LastName, LastName, NoOfProject, salary, NoOfProject);
	
	emp.calculateSalary();
	emp.displayEmployeeDetails();
	}
}
