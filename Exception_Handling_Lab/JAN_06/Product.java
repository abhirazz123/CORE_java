package JAN_06;

public class Product {
	private int id;
	private String name;
	private double price;
	private int quantity;

	}
		public int getid() 
		{
			return id;
		}
		public String getname () 
		{
			return name ;
		}
		public double getprice() 
		{
			return price;
		}
		public int getquantity() {
			return quantity;
		}
		
		public void decreaseQuantity(int amount) throws InsufficientQuantityException {
			if (amount > quantity) {
				throw new InsufficientQuantityException("Insufficient quantity for product: " + name);
			}
			quantity -= amount;
		}
		
		}
		