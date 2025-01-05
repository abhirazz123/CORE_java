package OCt_26.Constructor;

public class Person {
	private int PersonId;
	private String PersonName;
	
	public Person() //No Argument Constructor
	{
		PersonId = 111;
		PersonName = "Abhi";
	}
	public String toString() {
		return "Person [PersonId="+PersonId +"PersonName= "+PersonName+"]";
	}

}
