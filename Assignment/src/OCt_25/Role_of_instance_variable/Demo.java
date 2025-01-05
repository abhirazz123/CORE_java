package OCt_25.Role_of_instance_variable;

public class Demo {
	static int x = 100; // static field
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		
		--Demo.x;
		--Demo.x;
		
		System.out.println(d1.x);
		System.out.println(d2.x);
		
	}

}
