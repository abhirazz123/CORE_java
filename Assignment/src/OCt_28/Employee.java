package OCt_28;

public class Employee {
	String FirstName ;
	String LastName;
	int employeeId ;
	double salary;
	int NoOfProject ;
	
	
	public  Employee(String FirstName, String LastName, int employeeId, double salary, int NoOfProject) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.NoOfProject =NoOfProject;
		
	}
	public void calculateSalary() 
	{
		if(NoOfProject<0) {
			System.out.println("Number of projects cannot be negative");
		}
		else if(NoOfProject>5 && NoOfProject<10) 
		{
			salary +=500;
		}else if(NoOfProject>10 && NoOfProject<20) 
		{
			salary +=10000;
		}else if (NoOfProject>20){
			salary +=15000;
		}
		
	}
	public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + FirstName + " " + LastName);
        System.out.println("Salary: " + salary);
        System.out.println("Number of Projects: " + NoOfProject);
    }
}
