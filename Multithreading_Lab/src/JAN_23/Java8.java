package JAN_23;
// How to create anonymous a Thread of inner class Object

public class Java8 {
	public static void main(String[] args) {
		new Thread( new Runnable() {
			
			@Override
			public void run() {
				System.out.println("this is batch 39");
				
			}
		}).start();
		System.out.println( Thread.currentThread().isAlive());
		
	} 

}


