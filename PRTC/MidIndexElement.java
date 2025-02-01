 
class Account {
    private int balance = 0;
 
    public synchronized void withdraw(int amount) {
        while (balance < amount) {
            System.out.println(Thread.currentThread().getName() + " is waiting for sufficient balance to withdraw " + amount);
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ", updated balance: " + balance);
        notifyAll();
    }

 
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ", updated balance: " + balance);
        notifyAll();
    }
}

 
class Drawer extends Thread {
    private Account account;

  
    public Drawer(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        int[] withdrawals = {100, 200, 300}; // Array of amounts to withdraw
        for (int amount : withdrawals) {
            account.withdraw(amount);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

 
class Depositor extends Thread {
    private Account account;

    
    public Depositor(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        int[] deposits = {500, 200, 100};  
        for (int amount : deposits) {
            account.deposit(amount);
            try {
                Thread.sleep(1000);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
 
public class ATMMachine {
    public static void main(String[] args) {
        Account account = new Account();

         
        Depositor depositor = new Depositor(account);
        Drawer drawer = new Drawer(account);
 
        depositor.setName("Depositor");
        drawer.setName("Drawer");

        
        depositor.start();
        drawer.start();
    }
}