package JAN_04;
class Mytest extends Thread{
	@Override
public void run() {
		System.out.println("Child Thread id is : "+Thread.currentThread().getId());
		for(int i = 1; i<=5 ; i++) {
			System.out.println("i valuse is :"+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println("Thread has Interrupted");
			}
		}
	}
	
}


public class SleepDemo1 {

	public static void main(String[] args) {
	 
System.out.println("Main Thread id is :"+Thread.currentThread().getId());  //1
		
		Mytest m1 = new Mytest();		
		Mytest m2 = new Mytest();
		
		m1.start();
		m2.start();			
	}
}