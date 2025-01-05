package Day_16;


	public class EmployeeTester {
	    public static void main(String[] args) {
	        Employee emp1 = new Employee("Abhishek", 30, "Sales", 60000, "good");
	        emp1.updateSalary();
	        emp1.displayEmployeeInfo();

	        System.out.println();

	        Employee emp2 = new Employee("Mishra", -25, "HR", 47000, "good");
	        emp2.updateSalary();
	        emp2.displayEmployeeInfo();

	        System.out.println();

	        Employee emp3 = new Employee("Maya", 28, "IT", 152000, "average");
	        emp3.updateSalary();
	        emp3.displayEmployeeInfo();
	    }
	}
	

