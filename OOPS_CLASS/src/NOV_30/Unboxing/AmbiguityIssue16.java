package NOV_30.Unboxing;
class Test17
{
	public void accept(long s) 
	{
		System.out.println("Widening");
	}
	public void accept(Integer i) 
	{
		System.out.println("Autoboxing");
	}
}
public class AmbiguityIssue16 {

	public static void main(String[] args) {
		Test17 t = new Test17();
		t.accept(12);

	}

}
