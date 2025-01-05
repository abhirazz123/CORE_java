package OCt_23.Constructor;
import java.util.*;
public class EmployeeDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Employee Id");
		int id = sc.nextInt();	
		sc.nextLine();
		
		System.out.println("Enter the Emplyee name :");
		String name = sc.nextLine();
		
		System.out.println("Enter the Employee Salary:");
		double salary = sc.nextDouble();
		
		
		Employee abhi = new Employee(id, name, salary);
		abhi.calculateEmployeeGrade();
		abhi.getEmployeeData();
		
		/*Employee Scott = new Employee(1007, "Scott", 74000);
		Scott.calculateEmployeeGrade();
		Scott.getEmployeeData();*/
		
	}

}
