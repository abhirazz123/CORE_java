package OCt_28;

public class EmployeeDEV {
	int employeeNumber ;
	String employeeName ;
	double employeeSalary;
	
	public  EmployeeDEV(int employeeNumber, String employeeName, double employeeSalary) {
		this.employeeNumber = employeeNumber; 
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;

	}
	public void employeeSalary() {
		if(employeeSalary> 60000 ) {
			System.out.println("Employee is a Developer");
		}else if(employeeSalary >40000 && employeeSalary < 60000) {
			System.out.println("Employee is a Designer");
		}else if (employeeSalary<40000) {
			System.out.println("Employee is a Tester");
		}
		
	}
	public void displyEmployeeDEVdata() {
		System.out.println("Employee Number : "+employeeNumber);
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Employee Salary : "+employeeSalary);
	}
	

}
