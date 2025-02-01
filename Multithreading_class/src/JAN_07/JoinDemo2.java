package JAN_07;
class Alpha extends Thread{
	@Override
	public void run() {
		Thread t1 = Thread.currentThread();
		String name = t1.getName();
		 
		Beta b1 = new Beta();
		b1.setName("Beta_thread");
		b1.start();
		try {
			b1.join();
			System.out.println("Alpha thread re-started");
		}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		
		 for(int i=1; i<=10; i++) {
			 System.out.println(i + "by "+name );
		 }
	}
}

public class JoinDemo2 {
	public static void main(String[] args) {
		Alpha a = new Alpha();
		a.setName("Alpha_Thread");
		a.start();
		
	}

}
class Beta extends Thread{
	@Override
	public void run() {
		
		 Thread t1 = Thread.currentThread();
		 String name = t1.getName();
		 
		 for(int i=1; i<=10; i++) {
			 System.out.println(i+" by "+name);
			 try{
				 Thread.sleep(1000);
			 }catch(InterruptedException e) {
				 
			 }
		 }
		System.out.println("Beta Thread is ending.....");
		
	}
}