//In general we cann't change the return type of method while overriding a method. if we try to change it will generate compilation error because in method overriding, return type of both the methods must be compatible as shown in the program below.

package DIC_04.Method_Overriding;
class Super4
{
	public void m1() 
	{
		
	}
}
class Sub4 extends Super4
{
	@Override
	//public int m1() //error [int is note compatible with void]
	public void m1()
	{
		//return 0;
		return;
	}
}

public class Co_variant {

	public static void main(String[] args) {
		Super4 s4 = new Super4();
		s4.m1();

	}

}
