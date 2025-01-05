package OCT_21 ;

public class Fan1 {
	// Properties
	
	private  String name1 ;
	private String coil1;
	private int wings1;
	
	 // Constructor
	public Fan1(String name1, String coil1,int wings1) {
		this.name1 =name1;
		this.coil1 = coil1;
		this.wings1 = wings1;
	}
	//// Method to switch on the fan
	public void switchOn() {
		System.out.println(name1+"fan is switch On");
	}
	public void switchOf() {
		System.out.println(name1+"fan is switch Of");
	}
	
}
