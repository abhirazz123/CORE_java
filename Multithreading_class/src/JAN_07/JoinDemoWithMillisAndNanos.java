package JAN_07;

public class JoinDemoWithMillisAndNanos {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Child thread: " + i);
                    Thread.sleep(300); // 300 ms
                }
            } catch (InterruptedException e) {
                System.out.println("Child thread interrupted.");
            }
        });

        t.start();

        System.out.println("Main thread waiting for child thread...");
        t.join(1000, 500000); // Wait for 1000 ms and 500,000 nanoseconds (~1.5 seconds total)

        System.out.println("Main thread resumed after waiting.");
    }
}
