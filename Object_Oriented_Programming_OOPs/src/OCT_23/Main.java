package OCT_23;
class Test{
	static int a =100; // class Variable or static field
	int b = 200; 	  // Instance or no static variable
	public void accept(int c) {
		int d = 400;
		System.out.println(Test.a);
		System.out.println(this.b);
		System.out.println(c);
		System.out.println(d);
	}
}

public class Main {
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.accept(300);
		
	}

}
