package NOV_28.Polymorphism.Constructor_Overloading;
class Calculate
{
	public Calculate() {
		this(10,20);
	}
	public Calculate(int x,int y) 
	{
		this(100,200,300);
		System.out.println("sum of two integer is: "+(x+y));
	}
	public Calculate(int x, int y , int z) {
		System.out.println("sum of three integer is "+(x+y+z));
	}
}


public class ConstructorOverloading {

	public static void main(String[] args) 
	{
		new Calculate();

	}

}
