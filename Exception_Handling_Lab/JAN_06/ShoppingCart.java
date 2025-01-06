package JAN_06;

public 	class ShoppingCart {
    private Product[] cartItems;
    private int itemCount;

 
    public ShoppingCart(int capacity) {
        cartItems = new Product[capacity];
        itemCount = 0;
    }

 
    public void addToCart(Product product, int quantity) {
        if (product == null) {
            throw new for (int i = 0; i < itemCount; i++) {
                if (cartItems[i].getId() == product.getId()) {
                    productExistsInCart = true;
                    break;
                }
            }InvalidProductException("Invalid product: Product does not exist.");
        }

        try {
            product.decreaseQuantity(quantity);
            boolean productExistsInCart = false;

          
            

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