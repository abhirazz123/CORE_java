package OCt_23;

public class Employee {
	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int noOfProject;
	
	public void setEmployeeData(String firstName, String lastName, int employeeId, double salary, int noOfProject) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.noOfProject = noOfProject;
	}
	public void calculateSalary() 
	{
		if(noOfProject>5 && noOfProject<10) 
		{
			salary += 5000;
		}
		else if(noOfProject>10 && noOfProject< 20)
		{
			salary += 1000;
		}else if (noOfProject>20)
			salary +=15000;
		}
	 public void displayDetails() {
	        System.out.println("Employee Details:");
	        System.out.println("First Name: " + firstName);
	        System.out.println("Last Name: " + lastName);
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Salary: " + salary);
	        System.out.println("Number of Projects: " + noOfProject);
	}
	
	}
	


