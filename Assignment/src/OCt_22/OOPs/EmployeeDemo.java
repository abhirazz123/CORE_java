package OCt_22.OOPs;
import java.util.*;

public class EmployeeDemo {

    public static void main(String[] args) {
        Employee scott = new Employee();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Employee ID:");
        scott.employeeId = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter the Employee Name:");
        scott.employeeName = sc.nextLine(); // Use nextLine() to read full name

        System.out.println("Enter the Employee Address:");
        scott.employeeAddress = sc.nextLine(); // Use nextLine() for full address

        System.out.println("Enter the Employee Salary:");
        scott.employeeSalary = sc.nextDouble();

        // Display employee data
        scott.getEmployeeData();

        sc.close(); // Close the scanner
        System.out.println("================");
        
        Employee smith = new Employee();
		smith.setEmployeeData(222, "Smith", 56000, "Ameerpet");
		smith.getEmployeeData();
		
		Employee abhi = new Employee();
		abhi.setEmployeeData(1007, "Abhi razz", 15008, "hyd");
		abhi.getEmployeeData();
		

    }
}
