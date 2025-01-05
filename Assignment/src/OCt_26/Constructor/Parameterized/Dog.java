package OCt_26.Constructor.Parameterized  ;

public class Dog {
	private String dogName;
	private double dogHeight;
	private int dogAge;
	
	public Dog(String dogName, double dogHeight, int dogAge) 
	{
		this.dogName = dogName;
		this.dogHeight = dogHeight;
		this.dogAge = dogAge;
		
	}
	public String  toString() {
		return"Dog [DogName="+ dogName +", Dogheight= "+dogHeight + ",dogAge= "+dogAge +"]";
	}
	

}
