package OCt_23.assessment.Constructor;
import java.util.*;
public class Employee {
int employeeId ;
String employeeName;
double employeeSalary;

public void setEmployeeData() {
	Scanner sc = new Scanner (System.in);
	
	System.out.print("Enter the employee Id:");
	employeeId = sc.nextInt();
	sc.nextLine();
	
	System.out.print("Enter the employee Name: ");
	employeeName = sc.nextLine();
	
	System.out.print("Enter the employee Salary: ");
	employeeSalary = sc.nextDouble();
	}
public void getEmployeeData() {
	System.out.println("Employee Id:"+employeeId);
	System.out.println("Employee name:"+employeeName);
	System.out.println("Employee Salary: "+employeeSalary);
}

}
