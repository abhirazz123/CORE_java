Ques - 3
--------------
Simple Shopping Application
Objective:
---------
Develop a Java program for a simple shopping application that allows users to add products to a shopping cart and calculate the total price of the items in the cart. You will define custom exceptions for handling specific error cases and implement the necessary classes and methods to support the shopping functionality.

Requirements:
-------------
Custom Exceptions:

class InsufficientQuantityException(make it a Checked Exception) :
Methods:
------
Parameterized Constructor with String as parameter

Purpose : Thrown when the requested quantity of a product is not available.

class InvalidProductException(make it an Unchecked Exception):
Methods:
Parameterized Constructor with String as parameter.

Purpose : Thrown when a product is not found in the inventory.

BLC Product Class:
----------------

Attributes:
----------
id: int: representing the product's unique identifier.
name: String: representing the product's name.
price: double: representing the product's price.
quantity: int: representing the available quantity of the product.


Constructor: 
-----------
Parameterized Constructor to initialize all the atributes.

methods : 
-------
Method name: decreaseQuantity 
Access Modifier : public
return type : void
parameters : amount: int
Takes an integer amount as a parameter and decreases the product's quantity. Throws InsufficientQuantityException if the requested quantity is not available.

BLC  ShoppingCart Class:
Attributes:
cartItems: Product[] : to store items in the cart.
itemCount: int : An integer representing the number of items in the cart.

Constructor:
-----------
parameter : capacity : int 
Initialize the cartItems with a Product[] based on the given 
capacity.

Mehtods:
-------

Method name: addToCart 
Access Modifier : public
return type : void
parameters : Product,int
Adds the product to the cart or updates its quantity.Throws InsufficientQuantityException if the requested quantity is not available, or InvalidProductException if the product is not found.


Method name: calculateTotal 
Access Modifier : public
return type : double
parameters : no param
Method: Calculates and returns the total price of all items in the cart.


ElC ShoppingApplication Class:
============================

Main Method: Demonstrates the shopping application's functionality.
Creates some sample products and a shopping cart with a capacity of 10 products.
Adds products to the cart and handles exceptions as needed.
Calculates and displays the total price of the items in the cart.

Test Cases for Shopping Application
-----------------------------------------
Valid Product Addition:
Action: Add valid quantities of products to the cart.
Expected Output: Total price should be calculated correctly.

Insufficient Quantity:
Action: Attempt to add more quantity of a product than available.
Expected Output: Should throw InsufficientQuantityException with appropriate message.

Invalid Product Addition:
Action: Attempt to add a product that does not exist(i,e null).
Expected Output: Should throw InvalidProductException with appropriate message.

Full Cart:
Action: Attempt to add more products than the cart's capacity.
Expected Output: Should throw InvalidProductException with appropriate message.

Calculate Total with Empty Cart:
Action: Calculate total price with no products added.
Expected Output: Total price should be 0.0.

Calculate Total with Mixed Products:
Action: Add different products and quantities, then calculate total price.
Expected Output: Total price should reflect all products and quantities correctly.

==================================================================================


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

 
    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

  
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
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

        // Test Full Cart
        for (int i = 0; i < 10; i++) {
            try {
                cart.addToCart(p3, 1);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // Test Calculate Total with Empty Cart
        ShoppingCart emptyCart = new ShoppingCart(5);
        System.out.println("Total Price (Empty Cart): " + emptyCart.calculateTotal());

        // Test Calculate Total with Mixed Products
        System.out.println("Total Price (Mixed Products): " + cart.calculateTotal());
    }
}
