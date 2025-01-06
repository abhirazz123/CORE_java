package JAN_04;
class DoStuff extends Thread
{
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("Running Thread name is :"+name);
	}
}

public class ThreadName {
	public static void main(String[] args) {
		DoStuff t1 = new DoStuff();
		DoStuff t2 = new DoStuff();
		
		
		t1.start();
		t2.start();
		
		System.out.println(Thread.currentThread().getName()+"Thread is running....");
	}

}
