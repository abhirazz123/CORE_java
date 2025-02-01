package OCT_22;
import java.util.*;
public class ProductDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		Product laptop = new Product();
		System.out.print("Enter the laptop brand name :");
		laptop.LaptopBrand=sc.next();
		
		Product price = new Product();
		System.out.print("Enter the Product Price : ");
		laptop.LaptoPrice = sc.nextDouble();
		
		Product tuch = new Product();
		System.out.print("Product type tuch/ notuch : ");
		laptop.isTochScreen =sc.nextBoolean() ;
		
	System.out.println("=============================");
		laptop.getLaptopInformation();
		
		
		
		
	}

}
