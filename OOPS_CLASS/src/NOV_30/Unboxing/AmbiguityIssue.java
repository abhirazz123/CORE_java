package NOV_30.Unboxing;

class Test 
{
	public void accept(double d) {
		System.out.println("double");
	}
	
	public void accept(float d) {
		System.out.println("float");// top to bottom
	}
	
}


public class AmbiguityIssue {

	public static void main(String[] args) 
	{
		Test t = new Test();
		t.accept(6);
	}

}
