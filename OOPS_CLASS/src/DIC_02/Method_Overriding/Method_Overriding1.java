package DIC_02.Method_Overriding;
class Animal
{
	public void eat()
	{
		System.out.println("Generic Animal is eating");
	}
}
class Dog extends Animal
{
	public void eat() {
		System.out.println("Dog Animal is eating");
	}
}
class Puppy extends Dog
{
	public void eat() {
		
	}
		
}
public class Method_Overriding1 {

	public static void main(String[] args) 
	{
		Animal a = new Animal();
		a.eat();
		

	}

}
