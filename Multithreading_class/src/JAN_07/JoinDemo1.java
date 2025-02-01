package JAN_07;

public class JoinDemo1 
{
	public static void main(String[] args) throws InterruptedException 
	{
       System.out.println("Main Thread started");
       
       Thread t = Thread.currentThread();
       
       for(int i=1; i<=10; i++)
       {
    	   System.out.println(i+" by "+t.getName());
       }
       
       t.join();  //Deadlock [Main thread is waiting 4 main thread to complete]
           
       System.out.println("Main Thread Ended");
	}
}
