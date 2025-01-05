package DIC_03.Method_Overriding;
class Test18
{
	public void accept(Integer x) {
		System.out.println("Integer");
	}
	public void accept(int ...y) {
		System.out.println("Var args");
	}
}

public class AmbiguityDemo18 {
	public static void main(String[] args) {
		Test18 t18 = new Test18();
		t18.accept(15);
	}
}
