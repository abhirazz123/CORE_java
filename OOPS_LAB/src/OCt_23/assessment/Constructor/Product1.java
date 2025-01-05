package OCt_23.assessment.Constructor;
import java.util.*;
public class Product1 {
	   private int productId;
	    private String productName;
	    private double productPrice;
	    
	    public void setProductData() {
	    	Scanner sc = new Scanner (System.in);
	    	
	    	System.out.println("Eneter the product ID:");
	    	productId = sc.nextInt();
	    	sc.nextLine();
	    	
	    	System.out.println("Enter the product name:");
	    	productName = sc.nextLine();
	    	
	    	System.out.println("Enetr the product price:");
	    	productPrice= sc.nextDouble();
	    	
	    	sc.close();
	    }
	    public void  getProductInfo() {
	    	System.out.println("Product Id is : "+productId);
	    	System.out.println("product name is "+productName);
	    	System.out.println("product Price"+productPrice);
	    	
	    }
	    public static void main(String[] args) {
	    	Product1 prod = new Product1();
	    	prod.setProductData();
	    	prod.getProductInfo();
		}
	    
}
