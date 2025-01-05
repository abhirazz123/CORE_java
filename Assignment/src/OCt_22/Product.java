package OCt_22;
import java.util.*;
public class Product {
	 int productId  ;
	 String productName;
	 double productPrice;
	 
	 public void setProductData() {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter the Product id : ");
		 productId = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.print("Enter the product name :");
		 productName = sc.nextLine();
		 
		 System.out.print("Enter the product price:");
		 productPrice = sc.nextDouble();
	 }
		
	 public void getDogInformation() {
		 System.out.println("productPrice = "+productId);
		 System.out.println("productPrice = "+productName);
		 System.out.println("productPrice = "+productPrice);
	 }
}
