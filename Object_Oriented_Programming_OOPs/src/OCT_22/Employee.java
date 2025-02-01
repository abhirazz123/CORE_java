package OCT_22;

public class Employee {
	int employeeId;
	String employeeName;
	double employeeSalary;
	String employeeAddresh;
	
	public void SetemployeeData(int employeeId, String employeeName, double employeeSalary, String employeeAddresh) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeAddresh = employeeAddresh;
		
	}
	public void getemployeeDetlic() {
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Employee Name : " +employeeName);
		System.out.println("Employee Salary :"+ employeeSalary);
		System.out.println("Employee Address :" +employeeAddresh);
	}

}
