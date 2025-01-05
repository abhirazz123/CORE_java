package OCt_22.OOPs;

public class Employee {
	   int employeeId;
	   String employeeName;
	   double employeeSalary;
	   String employeeAddress;
	   public void setEmployeeData(int id ,String name,double Salary,String Addr) {
		   employeeId = id ;
		   employeeSalary=  Salary;
		   employeeAddress=  Addr ;
	   }
	   public void getEmployeeData() {
		   System.out.println("Employee id is "+employeeId);
		   System.out.println("Employee name is "+employeeName);
		   System.out.println("Employee Address "+employeeAddress);
		   System.out.println("Enployee Salary:"+employeeSalary);
	   }
}
