package OCT_21.OOPs;

public class StudentDemo {

	public static void main(String[] args) {
		Student raj = new Student();
		// Initialize the object properties using reference variable 
		raj.name = "Abhi razz";
		raj.age= 22;
		raj.height= 5.4;
		
		// calling for Behavior
		raj.talk();
		raj.writeExam();
		System.out.println("========================");
		Student priya = new Student();
		priya.name= "prya";
		priya.age= 23;
		priya.height= 5.7;
		
		//calling Behavior 
		priya.talk();
		priya.writeExam();
	}

}
