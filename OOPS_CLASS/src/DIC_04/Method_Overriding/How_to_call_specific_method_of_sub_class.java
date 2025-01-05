package DIC_04.Method_Overriding;

class Animal2
{
	public void roam()
	{
		System.out.println("Generic Animal is roaming");
	}
}
class Lion extends Animal2
{
	public void roam()
	{
		System.out.println("Lion Animal is roaming");
	}
	
	public void roar()
	{
		System.out.println("Lion is roaring");
	}
}
class Dog extends Animal2
{
	public void roam()
	{
		System.out.println("Dog Animal is roaming");
	}
	
	public void bark()
	{
		System.out.println("Dog is Barking");
	}
}
public class How_to_call_specific_method_of_sub_class 
{
	public static void main(String[] args) 
	{
       Animal2 a = new Lion();
       animalRoam(a);
       
       a = new Dog();
       animalRoam(a);
	}
	
	public static void animalRoam(Animal2 animal)
	{	    
	
	    Lion lion = (Lion) animal;
	    lion.roam();
	    lion.roar();
	}

}