//Note : Here child thread is not interrupted, so catch block will not be executed.

package JAN_04;
class Sleep extends Thread{
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("i value is: "+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println("Thread is interrupted "+e);
			}
		}
	}
}




public class SleepDemo {

	public static void main(String[] args) {
		Sleep s1 = new Sleep();
		s1.start();
		 
	}

}
