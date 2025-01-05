package DIC_28;

abstract class Employee {
    protected String name;
    protected int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public abstract double calculateSalary();

    public abstract String generatePayStub();

    public String displayEmployeeInfo() {
        return "Employee Name: " + name + ", ID: " + employeeId;
    }
}

class Manager extends Employee {
    private int numberOfSubordinates;

    public Manager(String name, int employeeId, int numberOfSubordinates) {
        super(name, employeeId);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double calculateSalary() {
        return 5000 + (numberOfSubordinates * 100);
    }

    @Override
    public String generatePayStub() {
        return "Manager Pay Stub: Name: " + name + ", Salary: $" + calculateSalary();
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Abhi", 101, 5);

        
        System.out.println(manager.displayEmployeeInfo());

      
        System.out.println("Manager Salary: $" + manager.calculateSalary());
        System.out.println(manager.generatePayStub());
    }
}
