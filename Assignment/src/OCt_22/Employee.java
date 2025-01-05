package OCt_22;
import java.util.*;
public class Employee {
int employeeId;
String employeeName ;
double employeeSalary ;

public void setEmployeeData () {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the employeeId: ");
	employeeId = sc.nextInt();
	sc.nextLine();
	
	System.out.print("Enter the employeeName: ");
	employeeName = sc.nextLine();
	
	System.out.print("Enter the employeeSalary: ");
	employeeSalary = sc.nextDouble();
	}
public void getEmployeeData()
{
	System.out.println("employeeId = "+employeeId);
	System.out.println("employeeName = "+employeeName);
	System.out.println("employeeSalary ="+employeeSalary);
	
}
}
