package JAN24;

public class Customer implements Runnable 
{
    private Bakery bakery;
    private String customerName;

    public Customer(Bakery bakery, String customerName) 
    {
        this.bakery = bakery;
        this.customerName = customerName;
    }

    @Override
    public void run() 
    {
        while (true) 
        {
            bakery.buyGoods(customerName);
            try 
            {
                Thread.sleep(1000); 
            } catch (InterruptedException e) 
            {
                Thread.currentThread().interrupt();
            }
            if (bakery.isProductionFinished()) 
            {
                break;
            }
        }
        System.out.println(customerName + " finished buying goods.");
    }
}
