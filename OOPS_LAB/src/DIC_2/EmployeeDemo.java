package DIC_2;

import java.util.Scanner;

class Employee {
    int id;
    String name;
    double basicSalary;
    double HRAPer;
    double DAPer;

    public Employee(int id, String name, double basicSalary, double HRAPer, double DAPer) {
        if (basicSalary < 0 || HRAPer < 0 || DAPer < 0) {
            System.out.println("Error: Salary components must be non-negative.");
        }
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.HRAPer = HRAPer;
        this.DAPer = DAPer;
    }

    public double calculateGrossSalary() {
        return basicSalary + HRAPer + DAPer;
    }
}

class Manager extends Employee {
    double projectAllowance;

    public Manager(int id, String name, double basicSalary, double HRAPer, double DAPer, double projectAllowance) {
        super(id, name, basicSalary, HRAPer, DAPer);
        if (projectAllowance < 0) {
            System.out.println("Error: Salary components must be non-negative.");
        }
        this.projectAllowance = projectAllowance;
    }

    @Override
    public double calculateGrossSalary() {
        return super.calculateGrossSalary() + projectAllowance;
    }
}

class Trainer extends Employee {
    int batchCount;
    double perkPerBatch;

    public Trainer(int id, String name, double basicSalary, double HRAPer, double DAPer, int batchCount, double perkPerBatch) {
        super(id, name, basicSalary, HRAPer, DAPer);
        if (batchCount < 0 || perkPerBatch < 0) {
            System.out.println("Error: batchCount and perkPerBatch must be non-negative.");
        }
        this.batchCount = batchCount;
        this.perkPerBatch = perkPerBatch;
    }

    @Override
    public double calculateGrossSalary() {
        return super.calculateGrossSalary() + (batchCount * perkPerBatch);
    }
}

class Sourcing extends Employee {
    int enrollmentTarget;
    int enrollmentReached;
    double perkPerEnrollment;

    public Sourcing(int id, String name, double basicSalary, double HRAPer, double DAPer, int enrollmentTarget, int enrollmentReached, double perkPerEnrollment) {
        super(id, name, basicSalary, HRAPer, DAPer);

        if (enrollmentTarget < 0 || enrollmentReached < 0 || perkPerEnrollment < 0) {
            System.out.println("Error: Enrollment-related values must be non-negative.");
        }
        this.enrollmentTarget = enrollmentTarget;
        this.enrollmentReached = enrollmentReached;
        this.perkPerEnrollment = perkPerEnrollment;
    }

    @Override
    public double calculateGrossSalary() {
        double ratio = enrollmentTarget > 0 ? (double) enrollmentReached / enrollmentTarget : 0;
        return super.calculateGrossSalary() + (ratio * perkPerEnrollment);
    }
}

class TaxUtil {
    public static double calculateTax(Employee emp) {
        double grossSalary = emp.calculateGrossSalary();
        return grossSalary > 3000 ? grossSalary * 0.2 : grossSalary * 0.5;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee Type : \n1: Employee, \n2: Manager, \n3: Trainer, \n4: Sourcing: ");
        int choice = scanner.nextInt();

        System.out.printf("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.printf("Enter Name: ");
        String name = scanner.nextLine();
        System.out.printf("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();
        System.out.printf("Enter HRA Percentage: ");
        double HRAPer = scanner.nextDouble();
        System.out.printf("Enter DA Percentage: ");
        double DAPer = scanner.nextDouble();

        Employee emp = null;

        switch (choice) {
            case 1:
                emp = new Employee(id, name, basicSalary, HRAPer, DAPer);
                break;
            case 2:
                System.out.println("Enter Project Allowance: ");
                double projectAllowance = scanner.nextDouble();
                emp = new Manager(id, name, basicSalary, HRAPer, DAPer, projectAllowance);
                break;
            case 3:
                System.out.println("Enter Batch Count: ");
                int batchCount = scanner.nextInt();
                System.out.println("Enter Perk Per Batch: ");
                double perkPerBatch = scanner.nextDouble();
                emp = new Trainer(id, name, basicSalary, HRAPer, DAPer, batchCount, perkPerBatch);
                break;
            case 4:
                System.out.println("Enter Enrollment Target: ");
                int enrollmentTarget = scanner.nextInt();
                System.out.println("Enter Enrollment Reached: ");
                int enrollmentReached = scanner.nextInt();
                System.out.println("Enter Perk Per Enrollment: ");
                double perkPerEnrollment = scanner.nextDouble();
                emp = new Sourcing(id, name, basicSalary, HRAPer, DAPer, enrollmentTarget, enrollmentReached, perkPerEnrollment);
                break;
            default:
                System.out.println("Invalid Choice!");
                System.exit(0);
        }

        double empGrossSalary = emp.calculateGrossSalary();
        double empTax = TaxUtil.calculateTax(emp);
        System.out.println("Gross Salary: " + empGrossSalary);
        System.out.println("Tax: " + empTax);

        scanner.close();
    }
}