package DIC_02.Method_Overriding;

class Super 
{
	private void m1() {
		System.out.println("Private Method of super class");
	}
}
class Sub extends Super
{
	protected void m1() // re-declaration of Method
	{
		System.out.println("Method has re-declared");
	}
}

public class Method_Overriding5 {

	public static void main(String[] args) 
	{
		Sub s = new Sub();
		s.m1();

	}

}
//Note :- private method of super class is not available or not inherited in the sub class so if the sub class declare the method with same signature then it is not overridden method, actually it is re-declared in the sub class. 