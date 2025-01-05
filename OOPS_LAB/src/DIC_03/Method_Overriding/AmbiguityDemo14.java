package DIC_03.Method_Overriding;
class Test14
{
	public void accept(int x)
	{
		System.out.println("int");
	}
	public void accept(long y) {
		System.out.println("long");
		
	}
}

public class AmbiguityDemo14 {
	public static void main(String[] args) {
		Test14 T14 = new Test14();
		T14.accept(9);
		
	}

}
