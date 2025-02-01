package JAN_07;

public class Test3 {
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				System.out.println("task one");
			}
		}.start();
		new Thread()
		{
			@Override
			public void run() {
				System.out.println("Two one");
			};
		}.start();
		new Thread() {
			public void run() {
				System.out.println("Three one");
			}
		}.start();
	}
	
}
