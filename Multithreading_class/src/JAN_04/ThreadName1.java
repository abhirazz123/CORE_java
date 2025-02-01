package JAN_04;
class Demo1 extends Thread{
	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		System.out.println("Running thread name is "+name );
		
	}
}

public class ThreadName1 {

	public static void main(String[] args) {
		 Thread t = Thread.currentThread();
		 t.setName("Parent");
		 
		 Demo1 d1 = new Demo1();
		 Demo1 d2 = new Demo1();
		 
		 d1.setName("child 1");
		 d2.setName("child 2");
		 
		 d1.start();
		 d2.start();
		 
		 String name = Thread.currentThread().getName();
		 System.out.println(name +" thread is running hare...");
				 

	}

}
//Note : Here we are providing the user-defined name i.e child1 and child2 for both the user-defined thread.
