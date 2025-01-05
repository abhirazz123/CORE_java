package OCt_23.parameter_variable;

public class Product {
	int ProductId;
	String ProductNeme;
	public void setProductData( int ProductId , String ProductNeme ) {
		this.ProductId = ProductId;
		this.ProductNeme = ProductNeme;
	}
	
	public String toString() {
		return "Product [ProductId = "+ProductId+",Product Neme = "+ProductNeme+"]";
		
		
	/*public String toString() {
		return "Product [ProductId=" + ProductId + ", ProductNeme=" + ProductNeme + "]";*/
	}
	
	

}
