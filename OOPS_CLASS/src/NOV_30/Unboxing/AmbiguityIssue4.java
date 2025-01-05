package NOV_30.Unboxing;
class Test5
{
	public void accept(short ...d)
	{
		System.out.println("short");
	}
	public void accept(char ...d)
	{
		System.out.println("char");
	}	
}
public class AmbiguityIssue4 {

	public static void main(String[] args) 
	{
		Test5 t = new Test5();
		//t.accept();Here we will get compilation error because there is no relation between char and short based on the specific type rule.
	
	}
}