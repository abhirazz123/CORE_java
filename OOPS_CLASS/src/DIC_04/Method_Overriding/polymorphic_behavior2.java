package DIC_04.Method_Overriding;

class Animal1
{
	public void roam()
	{
		System.out.println("Generic Animal is roaming");
	}
}
class Lion1 extends Animal1
{
	public void roam()
	{
		System.out.println("Lion Animal is roaming");
	}
}
class Dog1 extends Animal1
{
	public void roam()
	{
		System.out.println("Dog Animal is roaming");
	}
}
public class polymorphic_behavior2 
{
	public static void main(String[] args) 
	{
       Animal1 a = null;       
       a = new Lion1();       
       animalRoam(a);
       
       a = new Dog1();
       animalRoam(a);
	}
	
	public static void animalRoam(Animal1 animal)
	{
		animal.roam();
	}

}