package DIC_04.Method_Overriding;

class Vechicle
{
	public int getHorePower() {
		return 1000;
		
	}
	public void printHorsePower() {
		System.out.println("Vechile Horse Power : "+this.getHorePower());
	}
}
class car extends Vechicle
{
	public int getHorePower() {
		return  1200;
		
	}
	public void printHorsePower() {
		System.out.println("Car Horse Power : "+this.getHorePower());
	}
}

public class polymorphic_behavior {

	public static void main(String[] args) {
		Vechicle V1 = new car();
		V1.printHorsePower();
		
	}

}
