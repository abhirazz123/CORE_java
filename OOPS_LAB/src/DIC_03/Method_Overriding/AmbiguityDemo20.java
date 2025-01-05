package DIC_03.Method_Overriding;

public class AmbiguityDemo20
{
	public static void main(String[] args) 
	
	{
		System.out.println("String array args");
	}
	public static void main(String args) 
	{
		System.out.println("String variable");
	}
}
