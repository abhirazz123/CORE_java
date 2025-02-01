package JAN_23;
class NIT extends Thread{
	@Override
	public void run() {
		System.out.println("1st Thread");
	}
}
class NIT1 extends Thread{
	@Override
	public void run() {
		System.out.println("2nd Thread");
	}
}

public class Javaii8 {

	public static void main(String[] args) {
		NIT Thread = new NIT();
		NIT1 Thread1 = new NIT1();
		
		Thread.start();
		System.out.println(Thread.getPriority());
		System.out.println(Thread.isAlive());
		System.out.println(Thread1.isAlive());
		
		Thread1.start();
		System.out.println(Thread1.getPriority());
		
		 
	}

}
