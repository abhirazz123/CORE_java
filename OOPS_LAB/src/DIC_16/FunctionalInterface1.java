package DIC_16;

interface Add
{
	int add(int b);
}
public class FunctionalInterface1 {
	
	public static void main(String[] args)
	{
		int a = 10;
		
		Add add =   (int b) -> b;
		System.out.println("A : "+add.add(a));
	}
}
//a=20