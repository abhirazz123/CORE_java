package NOV_28;

public class Employee {
	private int empId;
	private String empName;
	private Address address;
	
	public Employee(int empId, String empName, Address address) {
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		
	}
	public String toString() {
		 return "Employee ID: " + empId + "\nEmployee Name: " + empName + "\nAddress: " + address.toString();
	}
	
}
