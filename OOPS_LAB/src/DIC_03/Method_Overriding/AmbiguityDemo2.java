package DIC_03.Method_Overriding;

class Test2
{
	public void accept(byte ...s)
	{
		System.out.println("byte");
	}
	public void accept(short ...s)
	{
		System.out.println("short");
	}
	
	
}

public class AmbiguityDemo2 {

	public static void main(String[] args) 
	{
		Test2 T2 = new Test2();
		T2.accept();

	}

}
