package JAN_07;
import java.io.*;
import java.util.*;
class Prime extends Thread{
	@Override
	public void run() {
		try {
			for(int i =1; i<=10; i++) {
				if(i ==2 || i ==3 || i ==5 || i == 7) {
					System.out.println(" This is Prime :  "+i);
				}
				Thread.sleep(500);
			}
		}catch(Exception e) {
			
		}
	}
}
class notPrime extends Thread{
	@Override
	public void run() {
		 try {
			 for(int i = 1; i<=10; i++) {
				 if(i == 4 || i == 6 || i == 9|| i == 10) {
					 System.out.println("This is notPrime : "+i);
				 }
				 Thread.sleep(500);
			 }
		 }catch(Exception e) {
			 
		 }
	}
}
public class Test6 {
	public static void main(String[] args) {
		new Prime().start();
		new notPrime().start();
		
	}

}
