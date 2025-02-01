package JAN_06;

public class AnonymousThreadWithReference {

	public static void main(String[] args) 
	{
		 Thread t1 = new Thread()
				 {
			 @Override
			 public void run() {
				 String name = Thread.currentThread().getName();
				 System.out.println(name + " thread running Hare...");
			 }
		};
		t1.start();
		String name = Thread.currentThread().getName();
		System.out.println("Currently Executing Thread name is :" + name);
		
			 
	}

}
