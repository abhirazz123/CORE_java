package OCT_19.Primitive_Variables;
class Primitive_VariablesDemo
{
	static int a;//static Field or class Variable 
	int b;  // Non Static field Or Instanc variable 
	public void accept(int c ) { // c is parameter varible
		int d = 400;	// d is local Variable 
		
		System.out.println("Class Variable :"+a);
		System.out.println("Instance Variable :"+b);
		System.out.println("Parameter Variable :"+c);
		System.out.println("Local Variable :"+d);
		
	}	
}
public class Primitive_Variables 
{
	public static void main(String[] args) 
	{
		Primitive_VariablesDemo t1 = new Primitive_VariablesDemo();
		
t1.accept(500);
	}

}
