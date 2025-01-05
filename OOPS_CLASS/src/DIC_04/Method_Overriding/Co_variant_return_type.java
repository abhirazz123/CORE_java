package DIC_04.Method_Overriding;
class Super6
{
	public Super6 m1() 
	{
		System.out.println("Super class Method");
		return this;
	}
}
class Sub6 extends Super6
{
	public Sub6 m1() {
		System.out.println("Sub class Method ");
		return this;
		
	}
}

public class Co_variant_return_type {

	public static void main(String[] args) {
		Super6 s1 = new Sub6();
		s1.m1();		

	}

}
