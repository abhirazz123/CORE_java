package OCt_25.variable_copy_demo;

public class Student  {
	int rollNumber;
	String studentName;
	String studentAddress;
	static String collegeName = "JNTU";
	static String courseName = "B.Tech";

	public void setStudentDetils(int rollNumber, String studentName, String studentAddress) {
		this. rollNumber = rollNumber;
		this. studentName = studentName;
		this. studentAddress= studentAddress;
		
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName = " + studentName + ", studentAddress = "
				+ studentAddress + ", collegeName = " + collegeName + ", courseName = " + courseName + "]";
	}
	
}
