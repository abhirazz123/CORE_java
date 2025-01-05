/*2)	Static methods can't be overridden so behavior is  same for all the Objects hence it is Static Polymorphism.*/

package DEC_05.Method_Hiding;

class Base 
{
	public static void m1() {
		System.out.println("Static Method Of Base class");
	}
}
class Derived extends Base{
	public static void m1() //Method Hiding [static Polymorphism]
	{
		System.out.println("static Method of Derived class");
	}
}

public class MethodHidingEx {

	public static void main(String[] args) {
		Base b = new Derived();
		b.m1();

	}

}
