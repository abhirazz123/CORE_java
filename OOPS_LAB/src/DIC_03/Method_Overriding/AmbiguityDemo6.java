package DIC_03.Method_Overriding;
class Test6
{
	public void accept(short ...s) {
		System.out.println("shorts");
		
	}
	public void accept(char ...s) {
		System.out.println("char");
		
	}
	
}

public class AmbiguityDemo6 {
	public static void main(String[] args)
	{
		Test6 T6 = new Test6();
		T6.accept('h');
		T6.accept((short)1);
	}

}
