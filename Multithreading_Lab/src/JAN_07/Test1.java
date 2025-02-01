package JAN_07;

class test extends Thread{
	public void run() {
		for(int i = 0;i<=10; i++) {
			System.out.println("Hello world here.."+i);
		}
	}
}


public class Test1 {

	public static void main(String[] args) {
		 test t = new test();
	 
		 t.start();
		 t.start();

	}

}
