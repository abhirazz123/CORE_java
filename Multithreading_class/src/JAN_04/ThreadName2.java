package JAN_04;

class DoStuff1 extends Thread{
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("Running Thread name is : "+name);
	}
}

public class ThreadName2 {

	public static void main(String[] args) {
		DoStuff1 d1 = new DoStuff1();
		DoStuff1 d2 = new DoStuff1();
		
		d1.start();
		d2.start();
		System.out.println(Thread.currentThread().getName()+"thread is running....");
				

	}

}
