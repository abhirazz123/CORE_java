package DIC_03.Method_Overriding;
class Test16
{
	public void accept(String x) {
		System.out.println("String");
	}
	public void accept(Integer x) {
		System.out.println("Integer");
	}
	public void accept(Object y) {
		System.out.println("object");
	}
}

public class AmbiguityDemo16 {
	public static void main(String[] args) {
		Test16 T16 = new Test16();
		// T16.accept(null); invalid
		T16.accept(1);  //Integer
		T16.accept("String"); // strng
	}
}
