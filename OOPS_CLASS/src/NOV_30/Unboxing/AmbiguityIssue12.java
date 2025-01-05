package NOV_30.Unboxing;

class Test12
{
	public void accept(Object s) 
	{
		System.out.println("Object");
	}
	public void accept(String s) 
	{
		System.out.println("string");
	}
}


public class AmbiguityIssue12 
{

	public static void main(String[] args)
	{
		Test12 t = new Test12();
		t.accept("NIT");

	}

}
