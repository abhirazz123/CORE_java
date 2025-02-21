package JAN_31_Iterator;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.concurrent.CopyOnWriteArrayList;

class Concurrent2 extends Thread{
	public CopyOnWriteArrayList<String> cites = null;
	
	public Concurrent2(CopyOnWriteArrayList<String> cites) {
		this.cites = cites;
		
	}
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) 
		{e.printStackTrace();
		
		}
		cites.add("Ameerpet");
	}
}


public class FailFastIterator2 {
	public static void main(String[] args) throws InterruptedException 
	{
		CopyOnWriteArrayList<String> cityName = new CopyOnWriteArrayList<String>();
		cityName.add("Indore");
		cityName.add("Bhubneswar");
		cityName.add("Hyderabad");
		cityName.add("Mumbai");
		cityName.add("Pune");
		
		Concurrent2 c1 = new Concurrent2(cityName);
		c1.start();
		
		Iterator<String> itr = cityName.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			Thread.sleep(500);
		}
		System.out.println("------------------------");
		Spliterator<String>spliterator = cityName.spliterator();
		spliterator.forEachRemaining(System.out::println);
	}

}
