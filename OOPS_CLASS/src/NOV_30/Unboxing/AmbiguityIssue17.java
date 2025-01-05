package NOV_30.Unboxing;
class Test18
{
	public void accept(int ...s) 
	{
		System.out.println("var args");
	}
	public void accept(Integer i) 
	{
		System.out.println("Autoboxing");
	}
}


public class AmbiguityIssue17 {

	public static void main(String[] args) 
	{
		Test18 t = new Test18();
		t.accept(12);
	}

}
