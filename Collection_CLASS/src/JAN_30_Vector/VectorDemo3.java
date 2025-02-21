package JAN_30_Vector;

import java.util.Vector;
record Prod (Integer id,String name ) {
	
}

public class VectorDemo3 {
	public static void main(String[] args) {
		Vector<Prod> listOfProduct = new Vector<>();
		listOfProduct.add(new Prod(333, "Mobile"));
		listOfProduct.add(new Prod(111, "Camera"));
		listOfProduct.add(new Prod(222, "Laptop"));
		listOfProduct.add(new Prod(444, "Tablet"));
		listOfProduct.forEach(System.out::println);
		System.err.println(listOfProduct);
	}

}
