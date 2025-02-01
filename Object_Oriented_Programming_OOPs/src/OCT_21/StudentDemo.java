package OCT_21;

public class StudentDemo {
	public static void main(String[] args) {
		Student raj = new Student();
		
		// Initialize  the object properties reference variable
		raj.name = "abhi";
		raj.rollNumber = 111;
		raj.height = 5.4;
		
		raj.takl();
		raj.writeExame();
		System.out.println("================================");
		
		Student razz = new Student();
		razz.name = "Abhi razz";
		razz.rollNumber = 1007;
		razz.height = 6.5;
		razz.takl();
		razz.writeExame();
	}

}
