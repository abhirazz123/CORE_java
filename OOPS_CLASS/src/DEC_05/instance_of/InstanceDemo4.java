package DEC_05.instance_of;
class Bird{
	
}
class Parrot extends Bird{
	
}
class Sparrow extends Bird{
	
}




public class InstanceDemo4 {
	public static void main(String[] args) 
	{
		Parrot p = new Parrot();
		Sparrow s = new Sparrow();
		Bird b = new Bird();
		acceptBirdType(b);
		
	}
	
	public static void acceptBirdType(Bird bird ) {
		if (bird instanceof Parrot) {
			System.out.println(" its is parrot Object");
		}
		else if(bird  instanceof Sparrow) {
			System.out.println("its is Sparrow object");
	
			}else {
				System.out.println("Another Object");
			}
		}
		
		
	}


