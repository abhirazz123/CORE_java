package JAN_09;

public class MultiThread implements Runnable
{
	public static void main(String[] args)  throws InterruptedException
	
	{
		Thread thread = new Thread(new MultiThread());
		thread.start();
		System.out.println("nit");
		thread.join();
			System.out.println("googale");
		
	}
	public void run() {
		System.out.println("Naresh IT");
	}

}
