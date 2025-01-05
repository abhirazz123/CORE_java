package OCT_19.Reference_Variable;

public class Product {
	String laptopBrand;
	double laptopPrice;
	boolean isTouchScreen;

	public void getLaptopInformation() {
		System.out.println("Laptop Brand is: "+laptopBrand);
		System.out.println("laptop Price is: "+laptopPrice);
		System.out.println("Laptop touch screen: "+(isTouchScreen ?"Yes":"no"));
		
	}
}
