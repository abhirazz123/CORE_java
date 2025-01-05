package NOV_11;

class Employee {
    protected String name;
    protected int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    public Manager(String name, int employeeId) {
        super(name, employeeId);
    }

    public void assignTask() {
        System.out.println(name + " is assigning tasks.");
    }
}

class Developer extends Employee {
    public Developer(String name, int employeeId) {
        super(name, employeeId);
    }

    public void writeCode() {
        System.out.println(name + " is writing code.");
    }
}

class Intern extends Employee {
    public Intern(String name, int employeeId) {
        super(name, employeeId);
    }

    public void learn() {
        System.out.println(name + " is learning.");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Manager manager = new Manager("Abhi", 101);
        Developer developer = new Developer("Bob", 102);
        Intern intern = new Intern("Razz", 103);

        manager.displayDetails();
        manager.assignTask();

        developer.displayDetails();
        developer.writeCode();

        intern.displayDetails();
        intern.learn();
    }
}
