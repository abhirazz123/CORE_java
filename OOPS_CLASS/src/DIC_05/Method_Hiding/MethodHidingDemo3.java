package DIC_05.Method_Hiding;

class Super3
{
	public  void m1()  //Object
	{		
	}
}
class sub3 extends Super3
{
	public static void m3()  //class
	{		
	}
}
public class MethodHidingDemo3 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
