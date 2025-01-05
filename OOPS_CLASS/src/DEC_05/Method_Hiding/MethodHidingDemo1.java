/* A public static method of super class by default available to sub class so, from sub class we can call super class static method with the help of Class name as well as object reference as shown in the below program */

package DEC_05.Method_Hiding ;
class Parentt 
{
	public static void show() {
		System.out.println("show method of Parent class ");
	}
}
class child extends Parentt
{
	
}

public class MethodHidingDemo1 {

	public static void main(String[] args) {
		child.show();
		child c= new child();
		c.show();
		

	}

}
