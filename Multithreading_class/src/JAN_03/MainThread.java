 //Program to show main is a thread with method chaining :

package JAN_03;

public class MainThread {
	 public static void main(String[] args) {
		String name = Thread.currentThread().getName();
		System.out.println("Current Thread Name is :"+name );
	}
}
