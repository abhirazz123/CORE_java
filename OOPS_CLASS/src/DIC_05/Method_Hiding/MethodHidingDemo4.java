package DIC_05.Method_Hiding;

class Super4
{
	public void m1() //class
	{

	}
}
class sub4 extends Super4{
	//public static int m1()  //overriding method is static
	public static int m2(){  // mthod name is change 
	{
		return 0;
	}
}
public class MethodHidingDemo4 {

	public static void main(String[] args) {
		System.out.println("Hello World");

	}

}}
