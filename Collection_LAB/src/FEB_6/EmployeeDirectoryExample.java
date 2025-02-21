package FEB_6;

import java.util.ArrayList;

class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', position='" + position + "', salary=" + salary + "}";
    }
}

class Directory {
    private ArrayList<Employee> employees;

    public Directory() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void updateEmployee(int index, Employee employee) {
        if (index >= 0 && index < employees.size()) {
            employees.set(index, employee);
        }
    }

    public void deleteEmployee(int index) {
        if (index >= 0 && index < employees.size()) {
            employees.remove(index);
        }
    }
}

public class EmployeeDirectoryExample {
    public static void main(String[] args) {
        Directory directory = new Directory();

        Employee alice = new Employee("Alice", "Manager", 60000.0);
        Employee bob = new Employee("Bob", "Developer", 50000.0);

        directory.addEmployee(alice);
        directory.addEmployee(bob);

        System.out.println("Initial display:");
        directory.displayAllEmployees();

        bob.setPosition("Senior Developer");
        bob.setSalary(55000.0);
        directory.updateEmployee(1, bob);

        System.out.println("\nAfter updating Bob's information:");
        directory.displayAllEmployees();

        directory.deleteEmployee(0);

        System.out.println("\nAfter deleting Alice:");
        directory.displayAllEmployees();
    }
}
