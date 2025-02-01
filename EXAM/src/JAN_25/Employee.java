package JAN_25;

public class Employee {
	protected String employeeName;
	protected String employeeDepartment;
	protected static int totalNoOfEmployees;
	
	public Employee(String employeeName, String employeeDepartment, int totalNoOfEmployees) {
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
		Employee.totalNoOfEmployees = totalNoOfEmployees;
		
	}
	

	public String getEmployeeName() {
		return employeeName;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public String getEmployeeDepartment() {
		return employeeDepartment;
	}



	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}



	public static int getTotalNoOfEmployees() {
		return totalNoOfEmployees;
	}



	public static void setTotalNoOfEmployees(int totalNoOfEmployees) {
		Employee.totalNoOfEmployees = totalNoOfEmployees;
	}



	public synchronized static void incrementTotalNoOfEmployees() {
		System.out.println();
	}


	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeDepartment=" + employeeDepartment + "]";
	}
	

}
