package NOV_30.Unboxing;
class Test13
{
	public void accept(Object s) 
	{
		System.out.println("object");
		
	}
	public void accept(String s) {
		System.out.println("string");
	}
	public void accept(Integer i) {
		System.out.println("Integer");
	}
}


public class AmbiguityIssue13 
{

	public static void main(String[] args) 
	{
		Test13 t = new Test13();
		//t.accept(null); error Here We will get compilation error

	}

}
