package JAN_07;
class Parrot implements Runnable
{

	@Override
	public void run() {
		 System.out.println(Thread.currentThread().getName());
		
	}
	
}
public class Test10 {
	static Parrot p;
	static {
		new Parrot();
		
	}
	{
		Thread t = new Thread(p,"Peacock");
		t.start();
	}
	public static void main(String[] args) {
		new Test10();
		new Thread( new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		},"koyal").start();
		new Thread(new Parrot(),"parrot").start();		
		}
		
		
	}
	 
		


		

