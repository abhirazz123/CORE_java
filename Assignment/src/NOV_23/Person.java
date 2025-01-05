package NOV_23;

public class Person {
   
    protected String name;
    protected int age;

   
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


 class Employee extends Person {
    protected String employeeId;

 
    public Employee(String name, int age, String employeeId) {
        super(name, age); 
        this.employeeId = employeeId;
    }

 
    public void displayEmployeeInfo() {
        
        System.out.println("Employee ID: " + employeeId);
    }
}


 class Manager extends Employee {
     
     private String department;

     public Manager(String name, int age, String employeeId, String department) {
         super(name, age, employeeId);  
         this.department = department;
     }

 
     public void displayManagerInfo() {
         displayEmployeeInfo();
         System.out.println("Department: " + department);
     }
 }
