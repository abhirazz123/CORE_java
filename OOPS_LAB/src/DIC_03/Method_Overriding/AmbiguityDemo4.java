package DIC_03.Method_Overriding;
class Test4
{
	public void accept(int ...s) {
		System.out.println("int :");
	}
	public void accept(short ...s) {
		System.out.println("short :");
	}
}


public class AmbiguityDemo4 {

	public static void main(String[] args) {
		Test4 T4 = new Test4();
		T4.accept();
	}

}
