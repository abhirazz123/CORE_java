package JAN_04;

class Test extends Thread
{
	@Override
	public void run()
	{
		
		System.out.println("Child Thread is running!!!"); 
	}
}

public class UserThread 
{
	public static void main(String[] args)
	{
		System.out.println("Main thread started!!!"); 
		
		Test t1 = new Test();
		t1.start();
				
		System.out.println("Main thread ended!!!"); 

	}

}