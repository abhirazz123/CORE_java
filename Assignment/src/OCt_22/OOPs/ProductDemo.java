package OCt_22.OOPs;
import java.util.*;
public class ProductDemo  {

	public static void main(String[] args) {
		Product laptop = new Product();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Laptop Brand: ");
		 laptop.laptopBrand= sc.nextLine();
		 
		 System.out.println("Eneter the laptoPrice");
		 laptop.laptopPrice = sc.nextDouble();
		 
		 System.out.println("Eneter the laptop Touch Screen");
		 laptop.isTouchScreen= sc.nextBoolean();
		 laptop.getLoptopInformation();
		 
		

	}

}
