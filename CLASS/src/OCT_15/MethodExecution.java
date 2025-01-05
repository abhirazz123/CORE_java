package OCT_15;

public class MethodExecution {

	public static void main(String[] args) {
		System.out.println("Main Method Started!!!");////1111111111
		m1();
		System.out.println("Main Method Ended!!!");///5555

	}
	public static void m1()
	{
		System.out.println("m1 Main Method Started!!!");//2222222222
		m2();
		System.out.println("m1 Main Method Ended!!!");///4444
		
	}
	public static void m2() {
		System.out.println("Hii i am m2 method");
	}

}
