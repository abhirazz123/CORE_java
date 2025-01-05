package OCt_26.Constructor;

public class student1 {
	private int rollNumber;
	public student1() //Default Constructor added by compiler
	{
		
	}
	public void setRollNumber() {
		rollNumber = 111;
	}
	public static void main(String[] args) {
		student1 raj = new student1(); //rollNumber=0
		raj.setRollNumber(); // rollNumber = 111
		
		
	}

}
