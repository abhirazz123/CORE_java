package FEB_20;
import java.io.*;
import java.util.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer studentId;
    private String studentName;
    private Double studentFees;
    private Date dateOfAdmission;

    public Student(Integer studentId, String studentName, Double studentFees, Date dateOfAdmission) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentFees = studentFees;
        this.dateOfAdmission = dateOfAdmission;
    }

    public static Student getStudentObject() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        Integer Id = sc.nextInt();
        sc.nextLine();  
        System.out.print("Enter Student Name: ");
        String Name = sc.nextLine();
        System.out.print("Enter Student Fees: ");
        Double Fees = sc.nextDouble();
        Date dateOfAd = new Date();  
        return new Student(Id, Name, Fees, dateOfAd);
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + studentName + 
               ", Fees: " + studentFees + ", Admission Date: " + dateOfAdmission;
    }
}

public class StoreObject {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            studentList.add(Student.getStudentObject());
            System.out.print("Do you want to add another student? (yes/no): ");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("yes"));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Student.txt"))) {
            oos.writeObject(studentList);
            System.out.println("Student objects have been stored successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
