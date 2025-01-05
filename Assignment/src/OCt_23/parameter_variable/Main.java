package OCt_23.parameter_variable;

 class Test {
	static int a = 100; // class Variable or Static field
	int b = 200; // Instance Variable or Non static Field
	
	public void accept(int c) {
		int d =400;
		System.out.println("A:"+Test.a);
		System.out.println("B:"+this.b);
		System.out.println("C:"+c);
		System.out.println("D:"+d);
		

	}
 }
	public class Main{
		public static void main(String[] args) {
		Test t1 = new Test();
		t1.accept(300);
		
	}
}
