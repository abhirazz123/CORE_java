package DIC_03.Method_Overriding;
class Test3
{
	public void accept(int ...s)
	{
		System.out.println("int");
	}
	public void accept(boolean ...s)
	{
		System.out.println("boolean");
	}
}

public class AmbiguityDemo3 {

	public static void main(String[] args) {
		Test3 T3 = new Test3();
		T3.accept(1);
		T3.accept(true);

	}

}
