package OCT_19.Reference_Variable;
import java.util.*;

public class ProductDemo {

    public static void main(String[] args) {
        Product laptop = new Product();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your laptop brand: ");
        laptop.laptopBrand = sc.next();

        System.out.print("Enter your laptop price: ");
        laptop.laptopPrice = sc.nextDouble();

        System.out.print("Enter if your laptop is touch screen (true/false): ");
        laptop.isTouchScreen = sc.nextBoolean();

        laptop.getLaptopInformation(); 
        sc.close(); 
    }
}
