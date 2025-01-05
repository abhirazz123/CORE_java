package OCt_28;
import java.util.*;
public class EmployeeDEVDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the employee Number: ");
		int employeeNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the employee Name: ");
		String employeeName = sc.nextLine();
		
		System.out.println("Enter the employee Salary: ");
		double employeeSalary = sc.nextDouble();
		
		EmployeeDEV EMP = new EmployeeDEV(employeeNumber, employeeName, employeeSalary);
		EMP.displyEmployeeDEVdata();
		EMP.employeeSalary();
		
		}

}
