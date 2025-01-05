package DIC_05.Method_Hiding;
class Supper
{
	public  static void M2() 
	{
		System.out.println("b");
	}
}
class Sub2 extends Supper
{
	
	//public  void M2() // overridden method is static
	public static void M2()
	{
		System.out.println("a");
	}
}
public class MethodHidingDemo2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello");
	}
}
