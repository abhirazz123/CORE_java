package Day_16;


	public class Employee {
	    private String name;
	    private int age;
	    private String department;
	    private double salary;
	    private String performance;

	    public Employee(String name, int age, String department, double salary, String performance) {
	        this.name = name;
	        setAge(age);
	        this.department = department;
	        this.salary = salary;
	        this.performance = performance;
	    }

	    public String getName() 
	    { return name; }
	    public void setName(String name) { this.name = name; }

	    public int getAge() { return age; }
	    public void setAge(int age) {
	        if (age > 0) this.age = age;
	        else {
	            System.out.println("Invalid input. Age must be a positive integer.");
	            this.age = -1;
	        }
	    }

	    public String getDepartment() { return department; }
	    public void setDepartment(String department) { this.department = department; }

	    public double getSalary() { return salary; }
	    public void setSalary(double salary) { this.salary = salary; }

	    public String getPerformance() { return performance; }
	    public void setPerformance(String performance) { this.performance = performance; }

	    public double updateSalary() {
	        if ("good".equalsIgnoreCase(performance)) salary += 10000;
	        else if ("average".equalsIgnoreCase(performance)) salary += 5000;
	        return salary;
	    }

	    public void displayEmployeeInfo() {
	        if (age > 0) {
	            System.out.println("Name: " + name);
	            System.out.println("Age: " + age);
	            System.out.println("Department: " + department);
	            System.out.println("Salary: " + salary);
	            System.out.println("Performance: " + performance);
	        }
	    }
	}

