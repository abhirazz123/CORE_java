package NOV_30.Unboxing;
class Test7
{
	public void accept(double ...d) 
	{
		System.out.println("double");
	}
	public void accept(long ...d) 
	{
		System.out.println("long ");
	}
}

public class AmbiguityIssue6 {

	public static void main(String[] args) {
		Test7 t = new Test7();
		t.accept();

	}

}
