package OCt_28.Encapsulation.method_return_type;

public class Product {
	private int productId;
	private String productName;
	private double productPrice;
	
	public Product(int productId, String productName, double productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
		
		public String  toString() {
			return  "Porduct [ productId = " +productId+ "productName = " +productName+" productPrice = "+ productPrice+"]";
		
	}
		public static Product getProductObject() {
			return new Product (111, "Laptop", 92000.90);
		}

}
