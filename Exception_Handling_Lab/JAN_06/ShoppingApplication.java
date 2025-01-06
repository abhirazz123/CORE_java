package JAN_06;
class InsufficientQuantityException extends Exception {
	public InsufficientQuantityException(String message) {
		super(message);
	}
}


class InvalidProductException extends RuntimeException {
	public InvalidProductException(String message) {
		super(message);
	}
}


class Product {
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
		
		 
		class ShoppingCart {
		    private Product[] cartItems;
		    private int itemCount;

		 
		    public ShoppingCart(int capacity) {
		        cartItems = new Product[capacity];
		        itemCount = 0;
		    }

		 
		    public void addToCart(Product product, int quantity) {
		        if (product == null) {
		            throw new InvalidProductException("Invalid product: Product does not exist.");
		        }

		        try {
		            product.decreaseQuantity(quantity);
		            boolean productExistsInCart = false;

		          
		            for (int i = 0; i < itemCount; i++) {
		                if (cartItems[i].getId() == product.getId()) {
		                    productExistsInCart = true;
		                    break;
		                }
		            }

		            if (!productExistsInCart) {
		                if (itemCount >= cartItems.length) {
		                    throw new InvalidProductException("Cart is full. Cannot add more products.");
		                }
		                cartItems[itemCount++] = product;
		            }
		        } catch (InsufficientQuantityException e) {
		            System.out.println(e.getMessage());
		        }
		    }

		    
		    public double calculateTotal() {
		        double total = 0.0;
		        for (int i = 0; i < itemCount; i++) {
		            total += cartItems[i].getPrice() * cartItems[i].getQuantity();
		        }
		        return total;
		    }
		}

		 
		public class ShoppingApplication {
		    public static void main(String[] args) {
		        
		        Product p1 = new Product(1, "Laptop", 1000.0, 5);
		        Product p2 = new Product(2, "Phone", 500.0, 10);
		        Product p3 = new Product(3, "Headphones", 100.0, 20);

		   
		        ShoppingCart cart = new ShoppingCart(10);

		        
		        try {
		            cart.addToCart(p1, 2);
		            cart.addToCart(p2, 3);
		            System.out.println("Total Price: " + cart.calculateTotal());
		        } catch (Exception e) {
		            System.out.println(e.getMessage());
		        }

		        
		        try {
		            cart.addToCart(p1, 10);
		        } catch (Exception e) {
		            System.out.println(e.getMessage());
		        }

		         
		        try {
		            cart.addToCart(null, 1);
		        } catch (Exception e) {
		            System.out.println(e.getMessage());
		        }

		 
		        for (int i = 0; i < 10; i++) {
		            try {
		                cart.addToCart(p3, 1);
		            } catch (Exception e) {
		                System.out.println(e.getMessage());
		            }
		        }

		      
		        ShoppingCart emptyCart = new ShoppingCart(5);
		        System.out.println("Total Price (Empty Cart): " + emptyCart.calculateTotal());

		       
		        System.out.println("Total Price (Mixed Products): " + cart.calculateTotal());
		    }
		}
