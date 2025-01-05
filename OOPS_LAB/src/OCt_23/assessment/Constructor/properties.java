package OCt_23.assessment.Constructor;

public class properties {
	int productId;
	String productName;
	double productPrice;
	
	public properties(int id , String name , double princ) {
		productId= id ;
		productName = name;
		productPrice = princ;
	}
	public void  getPropertiesDetils() {
		System.out.println("product Id :"+productId);
		System.out.println("product Name is : "+productName);
		System.out.println("product Price is : "+productPrice);
	}
}
