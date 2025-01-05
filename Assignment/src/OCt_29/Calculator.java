package OCt_29;
class Test
{
	public  int  add(int num1, int num2) {
		
		return num1 + num2;
	}
	public double add(double num1, double num2) {
		return num1 + num2;
		
	}
	public int multiply(int num1, int num2)
	{
		return num1 * num2;
		
	}
	public double multiply(double num1, double num2)
	{
		return num1 * num2;
		
	}
}


public class Calculator 
{
	public static void main(String[] args)
	{
		Test T = new Test();
		double add = T.add(10.5, 20.3);
		System.out.println("sum of to double : "+add);
		
		int mul = T.multiply(10, 20);
		System.out.println("multiply of two integer : "+mul);
		
		int negative = T.add(-10, 20);
		System.out.println("Add with negative integers : "+negative);
		
	}
}
