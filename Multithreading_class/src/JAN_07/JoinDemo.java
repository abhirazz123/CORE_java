package JAN_07;
class jion extends Thread
{
	@Override
	public void run() {
		 String name = Thread.currentThread().getName();
		 for(int i = 1; i<=5; i++) {
			 System.out.println("I value is : "+i +" by " +name  );
			 try {
				 Thread.sleep(1000);
			 }catch(InterruptedException e) {
				 e.printStackTrace();
			 }
		 }
		 System.out.println(name + " Thread is dead now");
	}
}

public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread started..");
		
		jion j1 = new jion();
		jion j2 = new jion();
		jion j3 = new jion();
		
		j1.setName("j1");
		j2.setName("j2");
		j3.setName("j3");
		
		j1.start();
		j1.join();
		System.out.println("Main thread wake up ");
		j2.start();
		j3.start();
		System.out.println("Main thread Completed ");
	}

}
