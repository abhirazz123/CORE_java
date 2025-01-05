package OCt_25.Role_of_instance_variable;

public class Test {
int x = 100; // no static field
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		
		--t1.x; --t2.x;
		
		System.out.println(+t1.x);
		System.out.println(t2.x);
	}
}
