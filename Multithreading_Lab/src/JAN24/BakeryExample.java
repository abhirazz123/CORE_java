package JAN24;

// Bakery Class....................................1.
class Bakery
{
	int goodsAvilabile;
	final int Max_Goods_Per_Day = 100;
	int goodsProduceToday;
	
	// 1st synchronized Method
	public synchronized void bakeGoods()
	{
		if (goodsAvilabile > 0)
		{
			try 
			{
				wait();
	        } 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
	        }
		}
		// for 10 goods per day.
		if (goodsProduceToday < Max_Goods_Per_Day)
		{
			int goodsToProduce = Math.min(10, Max_Goods_Per_Day-goodsAvilabile);
			goodsAvilabile += goodsToProduce;
			goodsProduceToday += goodsToProduce;
	        System.out.println("Baker produced " + goodsToProduce + " goods.");
	        notifyAll();
		}
	}

	//2nd synchronized Method
	public synchronized void buyGoods(String customerName)
	{
		while (goodsAvilabile == 0 && goodsProduceToday < Max_Goods_Per_Day)
		{
			try 
			{
				wait();
	        } 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
	        }
		}
		
		if (goodsAvilabile >0)
		{
			goodsAvilabile--;
			System.out.println(customerName + "brought item");
			if (goodsAvilabile == 0)
			{
				notifyAll();
			}
		}
		else
		{
			System.out.println("no goods avilable for" + customerName + ".");
		}
	}
	
	//Method public boolean isProductionFinished()
	public boolean isProductionFinished() 
	 {
	        return goodsProduceToday >= Max_Goods_Per_Day && goodsAvilabile == 0;
	 }	
}
//****************************************************************************************
//Baker Class....................................2.
//****************************************************************************************
//Customer Class....................................3.
//*******************************************************************************************
//main Class.........................................4.
public class BakeryExample 
{
	 public static void main(String[] args) throws InterruptedException {
	        Bakery bakery = new Bakery();
	        Baker baker = new Baker(bakery);
	        Customer customer1 = new Customer(bakery, "Customer 1");
	        Customer customer2 = new Customer(bakery, "Customer 2");
	        Customer customer3 = new Customer(bakery, "Customer 3");

	        Thread bakerThread = new Thread(baker);
	        Thread customerThread1 = new Thread(customer1);
	        Thread customerThread2 = new Thread(customer2);
	        Thread customerThread3 = new Thread(customer3);

	        bakerThread.start();
	        customerThread1.start();
	        customerThread2.start();
	        customerThread3.start();

	        bakerThread.join();
	        customerThread1.join();
	        customerThread2.join();
	        customerThread3.join();

	        System.out.println("Simulation finished.");
	    }
}
