package JAN_04;

import java.util.InputMismatchException;
import java.util.*;

class BatchAssignment extends Thread{
	
	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		
		if(name != null && name.equalsIgnoreCase("placement")) {
			this.placementBatch();
		}
		else if(name !=null && name.equalsIgnoreCase("regular")) {
			this.regularBatch();
		}else {
			throw new NullPointerException("Name can't be null");
		}
		
	}
	
	public void placementBatch() {
		System.out.println(" I am placementBatch Batch Student : ");
	}
	public void regularBatch() {
		System.out.println("i am regularBatch Batch Student ");
	}
}


public class ThreadName3 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		try(sc){
			System.out.println("Enter the Batch name : ");
			String titale = sc.next();
			
			BatchAssignment b = new BatchAssignment();
			b.setName(titale);
			b.start();
		}

	}

}
