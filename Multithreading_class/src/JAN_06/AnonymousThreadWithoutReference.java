package JAN_06;

public class AnonymousThreadWithoutReference {

	public static void main(String[] args) 
	{
		new Thread()
		{
			@Override
			public void run()
			{
				String name = Thread.currentThread().getName();
				System.out.println(name+" thread is running Here.");
			}
		}.start();

	}

}