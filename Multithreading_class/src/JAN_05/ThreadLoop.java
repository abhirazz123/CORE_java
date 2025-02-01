//WAP to show that when we work with multiple threads then processor will frequently move from one thread to another thread.

package JAN_05;

class Simple extends Thread{
	@Override
	public void  run() {
		String name = Thread.currentThread().getName();
		for (int i = 1; i<=10; i++) {
			System.out.println("i value is : "+i + "by "+name+"thread");
		}
		
	}
}

public class ThreadLoop {

	public static void main(String[] args) {
		Simple S1 =  new Simple();
		S1.start();
		
		String name = Thread.currentThread().getName();
		for(int i = 10; i<=10;i++)
		{
			System.out.println("i value is : "+i+"by "+name+ "thread");
		}
		int x = 1;
		do 
		{
			System.out.println("india by : "+name);
		}while(x<=10);
		 		 
	}
	 
}

 
