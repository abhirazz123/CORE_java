package OCt_22.Constructor;

public class Employee {
	int id ;
	String name;
	double salary;
	 
	public void show () {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	public static void main(String[] args) {
		Employee emp =new  Employee ();
		emp.show();
	}
	
	
}
