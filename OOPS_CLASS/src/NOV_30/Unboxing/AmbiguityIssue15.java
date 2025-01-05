package NOV_30.Unboxing;
class Test16
{
	public void accept(Number s) 
	{
		System.out.println("Number");
	}
	public void accept(Integer i) 
	{
		System.out.println("Integer");
	}
}

public class AmbiguityIssue15 {

	public static void main(String[] args) 
	{
		Test16 t = new Test16();
		t.accept(12);

	}

}
