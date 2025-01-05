package OCt_23.parameter_variable;

public class StudentDemo {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.accept();
		s.input(300, "john");
		System.out.println(s.id+":"+s.name);

	}

}
