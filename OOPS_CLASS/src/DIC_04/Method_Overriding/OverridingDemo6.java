package DIC_04.Method_Overriding;

class Super 
{
	public void m1() {
		
	}
}
class Sub extends Super
{
	@Override
	public void m1() {
	/*protected void m1() {error [super class method AM 
							       is public ]*/
		
	}
}

public class OverridingDemo6 {

	public static void main(String[] args) {
		
		Super s1 = new Sub();
		s1.m1();

	}

}
