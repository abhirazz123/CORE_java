package OCt_23.Constructor;
//Initializing the instance variable using parameter variable as per requirement :
public class Employee {
	int employeeId;
    String employeeName;
    double employeeSalary;   
    char employeeGrade;
    
    public Employee(int id , String name ,double salary) 
    {
    	employeeId= id;
    	employeeName= name ;
    	employeeSalary= salary;
    }
    	
    
    public void calculateEmployeeGrade() 
    {
    	if (employeeSalary>=9000) {
    		employeeGrade='A';
    	}else if (employeeSalary>=75000) {
    		employeeGrade='B';
    	}else if (employeeSalary>=50000) {
    		employeeGrade = 'c';
    	}else {
    		employeeGrade='D';
    	}
    		
    }
    public void getEmployeeData() {
    	System.out.println("Employee Id is :"+employeeId);
    	System.out.println("Employee Name is :"+employeeName);
    	System.out.println("Employee Salary is :"+employeeSalary);
    	System.out.println("Employee Grade is :"+employeeGrade);    
    } 

    	
    }



