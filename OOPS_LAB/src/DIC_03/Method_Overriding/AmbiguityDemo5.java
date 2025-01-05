package DIC_03.Method_Overriding;
class Test5
{
	public void accept(int ...s) {
		System.out.println("int ");
		
	}
	public void accept(char ...s) {
		System.out.println("int ");
		
	}
	
}

public class AmbiguityDemo5 {

	public static void main(String[] args) {
		Test5 T5 = new Test5();
		T5.accept();
	}

}
