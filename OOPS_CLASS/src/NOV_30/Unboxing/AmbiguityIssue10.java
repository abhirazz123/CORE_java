package NOV_30.Unboxing;

class test10
{
	public void accept(int d , long l) 
	{
		System.out.println("int-long");
	}
	public void accept(long s, int i) {
		System.out.println("long-int");
	}
}
public class AmbiguityIssue10 {

	public static void main(String[] args) 
	{
		test10 t = new test10();
		//t.accept(9, 9); error:-Here We will get ambiguity issue.
	}

}
