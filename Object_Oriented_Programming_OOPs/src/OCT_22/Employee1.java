package OCT_22;

public class Employee1 {
	int id ;
	String name ;
	double salary;
	
	public void show() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	public static void main(String[]args) {
		Employee1 emp = new Employee1();
		emp.show();
		
	}

}
