package OCT_22;
import java.util.*;

public class EmployeeDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("Enter the Employee Id");
		emp.employeeId = sc.nextInt();
		
		System.out.println("Enter the Employee name :");
		emp.employeeName = sc.next();
		
		System.out.println("Enter the Employee Salary :");
		emp.employeeSalary = sc.nextDouble();
		
		System.out.println("Entr the Employee Addresh: ");
		emp.employeeAddresh = sc.next();
		
		
		emp.getemployeeDetlic();
		
	}

}
