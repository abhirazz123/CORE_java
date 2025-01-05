package DIC_04.Method_Overriding;

class Alpha
{
	
}
class Beta extends Alpha
{
	
}
class Super5 {
	public Alpha m1() {
		System.out.println("Super class Method");
		return  new Alpha();
	}
}
class Sub5 extends Super5
{
	@Override
	public Beta m1() {
		System.out.println("Sub class Method");
		return new Beta();
	}
}

public class Co_variant_JDK1_5 {

	public static void main(String[] args) {
		
		Super5 s1 = new Sub5();
		s1.m1();
		
		
	}

}
