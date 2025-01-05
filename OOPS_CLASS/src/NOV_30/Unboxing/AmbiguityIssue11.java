package NOV_30.Unboxing;

class test11
{
	public void accept(Object s) 
	{
		System.out.println("object");
	}
	public void accept(String s) 
	{
		System.out.println("string");
	}
}

public class AmbiguityIssue11 {

	public static void main(String[] args) 
	{
		test11 t = new test11();
		t.accept(9);

	}

}
