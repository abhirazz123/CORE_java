package DIC_05.instance_of;


class Bird
{
	
}
class Parrot extends Bird{}

class Sparrow extends Bird{}

public class InstanceDemo4 
{
	public static void main(String[] args) 
	{
		Parrot p = new Parrot();
		Sparrow s = new Sparrow();
		
		acceptBirdType(s);
	}

	public static void acceptBirdType(Bird bird)
	{		
		if(bird instanceof Parrot)
		{
			System.out.println("It is a Parrot object");
		}
		else
		{
			System.out.println("Another Object");
		}
		
		
	}
	

	
	
}