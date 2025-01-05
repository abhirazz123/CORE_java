package OCt_28.Encapsulation_Setter_and_Getter;

public class Student 
{
	private int studentId;  
	private String studentName; 
	private int studentMarks;
	private String studentAddress;

	public Student(int studentId, String studentName, int studentMarks, String studentAddress) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
		this.studentAddress = studentAddress;
		
	}
	@Override
    public String toString () {
		return "studentId:"+ studentId+ "\n"+
		"studentName:" +studentName +"\n"+
		"studentMarks: "+studentMarks;
	
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String  studentName) {
		this.studentName = studentName;
	}
	public int  getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(int studentMarks) {
		this.studentMarks =studentMarks;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress=studentAddress;
	}
}
