package NOV_30.Unboxing;
class test9
{
	public void accept(int i )
	{
		System.out.println("int ");
	}
	public void accept(long l) 
	{
		System.out.println("long");
	}
}

public class AmbiguityIssue9 
{
	public static void main(String[] args) 
	{
		test9 t = new test9();
		t.accept(9);
	}
}
