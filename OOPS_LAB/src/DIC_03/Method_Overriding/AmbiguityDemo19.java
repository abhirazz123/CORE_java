package DIC_03.Method_Overriding;

class Test19
{
	public void accept(long x) {
		System.out.println("long");
	}
	public void accept(int ...y) {
		System.out.println("var args");
	}
}

public class AmbiguityDemo19 {

	public static void main(String[] args) {
		Test19 t19 = new Test19();
		t19.accept(15);

	}

}
