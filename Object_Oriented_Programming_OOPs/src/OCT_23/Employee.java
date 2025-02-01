package OCT_23;

public class Employee {
	int employeeId;
    String employeeName;
    double employeeSalary;   
    char employeeGrade;

    public void setEmployeeData(int employeeId, String employeeName, double employeeSalary, char employeeGrade) {
    	this.employeeId= employeeId;
    	this.employeeName = employeeName;
    	this.employeeSalary = employeeSalary;
    	this.employeeGrade = employeeGrade;
    }
    public void calculateEmployeeGrade() {
    	if(employeeSalary >90000)
    	{
    		employeeGrade= 'A';
    	}else if(employeeSalary >= 750000) {
    		employeeGrade = 'B';
    	}else if(employeeSalary >= 650000) {
    		employeeGrade = 'C';
    		
    	}else {
    		employeeGrade = 'D';
    	}
    }
    public void getEmployeeData()
    {
    	System.out.println("Employee Id is :"+employeeId);
    	System.out.println("Employee Name is :"+employeeName);
    	System.out.println("Employee Salary is :"+employeeSalary);
    	System.out.println("Employee Grade is :"+employeeGrade);    
    } 
    
}
