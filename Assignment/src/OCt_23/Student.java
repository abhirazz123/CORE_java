package OCt_23;

public class Student {
	private int  studentId ;
	private String studentName;
	private int marks;
	private char grade;
	
	public void calculateGrade(int studentId, String studentName, int marks) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		calculateGrade();
		
	}public void calculateGrade() {
		if (marks>90) {
			grade ='A';
		}else if(marks>80) {
			grade = 'B';
		}else if(marks>70) {
			grade = 'C';
		}else if(marks>60) {
			grade = 'D';
		}else {
			grade ='E' ;
		}
		
	}
	public void displayDetails() {
		System.out.println("studentId = "+studentId);
		System.out.println("studentName = "+studentName);
		System.out.println("marks = "+marks);
		System.out.println("grade = "+grade);
	}

}
