package JAN24;

public class Baker implements Runnable 
{
    private Bakery bakery;

    public Baker(Bakery bakery) 
    {
        this.bakery = bakery;
    }

    @Override
    public void run() 
    {
        while (!bakery.isProductionFinished()) 
        {
            bakery.bakeGoods();
        }
        System.out.println("Baker finished producing goods.");
    }
}
