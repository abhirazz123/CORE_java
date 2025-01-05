package DIC_03.Method_Overriding;
class Test
{
	public void accept(long ...b)
	{
		System.out.println("long :");
	}
	public void accept(byte  ...s) 
	{
		System.out.println("byte :");
	}
	public void accept(float ...s)
	{
		System.out.println("Float");
	}
	
}


public class AmbiguityDemo1 {

	public static void main(String[] args) 
	{
		Test t = new Test();
		t.accept();

	}

}
