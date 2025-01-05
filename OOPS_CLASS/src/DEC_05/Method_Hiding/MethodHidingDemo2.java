/* case2
 We can't override a static method with non static method because static method belongs to class and non static method belongs to object, If we try to override static method with non static method then it will generate an error i.e overridden method is static as shown below.

*/

package DEC_05.Method_Hiding;
class Super{
	public static void m2() { // class 
		
	}
}
class Sub extends Super{

	public void m2() {// OBJECT
		
	}
}

public class MethodHidingDemo2 {

	public static void main(String[] args) 
	{
		System.out.println("hello world");

	}

}
