//Program to show main is a thread without method chaining :
package JAN_03;
public class Main 
{
	public static void main(String[] args) 
	{	
		Thread t1 = Thread.currentThread() ;
		System.out.println("Current thread Name is :"+t1);
	}

}
