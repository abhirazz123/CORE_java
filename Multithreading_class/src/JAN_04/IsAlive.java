package JAN_04;
class Demo extends Thread{
	@Override
	public void run() {
		System.out.println("Child Thread is running in a separate Stack");
		
	}
}

public class IsAlive 
{

	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
		System.out.println("Is child thread started before start() : "+d1.isAlive());
		
		d1.start();
		System.out.println("Is child thread started After start() : "+d1.isAlive());
		Demo d2 = new Demo();
		
		d1.start();//java.lang.IllegalThreadStateException 
 
	}
	
}
