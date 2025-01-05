package NOV_30.Unboxing;

class Test2
{
	public void accept(int ...d) 
	{
		System.out.println("int");
	}
	public void accept(char ...d)
	{
		System.out.println("char");
	}
}

public class AmbiguityIssue3 {

	public static void main(String[] args) 
	{
		Test2 t = new Test2();
		t.accept();
	
	}

}
//char will be executed becoz char is more specific type.