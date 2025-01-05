package NOV_30.Unboxing;
class Test6
{
	public void accept(short ...d) 
	{
		System.out.println("short");
	}
	public void accept(byte ...d) {
		System.out.println("byte");
	}
}

public class AmbiguityIssue5 {

	public static void main(String[] args) {
		Test6 t = new Test6();
		t.accept();

	}

}
