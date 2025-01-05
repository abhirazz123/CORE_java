package NOV_28.Polymorphism.var_args_Overloading;

class Demo
{
	// All commented codes are invalid
	
		/*
		 * public void accept(float ...x, int ...y) { }
		 * 
		 * public void accept(int ...x, int y) { }
		 * 
		 * public void accept(int...x, int ...y) {}
		 */
	public void accept(int x , int...y ) 
	{
		System.out.println("X value is :"+x);
		for(int z:y) {
			System.out.println(z);
		}
	}
}

public class VarArgsDemo4 {
	public static void main(String[] args) {
		Demo D = new Demo();
		D.accept(10, 10,20,30,40);
	}

}
