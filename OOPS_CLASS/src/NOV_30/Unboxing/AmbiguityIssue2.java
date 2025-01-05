package NOV_30.Unboxing;
class Test1
{
	public void accept(int d)
	{
		System.out.println("int");
	}
	public void accept(char d)
	{
		System.out.println("char");
	}	
}
public class AmbiguityIssue2 {

	public static void main(String[] args) 
	{
		Test1 t = new Test1();
		t.accept(6);


	}
}