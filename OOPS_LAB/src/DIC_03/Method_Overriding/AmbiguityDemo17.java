package DIC_03.Method_Overriding;

class Test17{
	public void accept(Integer x) {
		System.out.println("Integer");
		
	}
	public void accept(long y) {
		System.out.println("long");
	}
}


public class AmbiguityDemo17 {
	public static void main(String[] args) {
		Test17 T17 = new Test17();
		T17.accept(15);
		
	}
}
