package OCT_23;
import java.util.*;
public class EmployeeDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("Enter the Employee id :");
		emp.employeeId = sc.nextInt();
		
		System.out.println("Enter the Employee Name :");
		emp.employeeName = sc.next();
		
		System.out.println("Enter the Employee Salary : ");
		emp.employeeSalary = sc.nextDouble();
		
		emp.calculateEmployeeGrade();
		emp.getEmployeeData();
	}

}
