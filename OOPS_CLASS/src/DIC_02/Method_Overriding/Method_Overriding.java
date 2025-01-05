package DIC_02.Method_Overriding;

class Bire 
{
	public void fly()
	{
		System.out.println("Generic Bird is flying");
	}
}
class Parraot extends Bire
{
	public void fly()
	{
		System.out.println("Generic Bird is flying");
	}
}
class Sparrow extends Bire 
{
	public void fly() {
		System.out.println("Sparrow Bire is flying ");
	}
}
public class Method_Overriding {

	public static void main(String[] args) 
	{
		Bire b = null;
		b = new Parraot(); b.fly();
		b = new Sparrow(); b.fly();
		
	}

}
