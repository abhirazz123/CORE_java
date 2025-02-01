package JAN_07;


class  Tatkal implements Runnable
{
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name+" is booking under Tatkal Schema");
	}

}
class PremimumTatkal implements Runnable
{
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		 System.out.println(name+" is booking under PremimumTatkal Schema");
	}
	
}
public class RunnableDemo1 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Tatkal(),"abhi");
		t1.start();
		
		Thread t2 = new Thread(new PremimumTatkal(),"razz");
		t2.start();

	}

}
