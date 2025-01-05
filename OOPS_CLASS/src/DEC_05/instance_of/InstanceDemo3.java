package DEC_05.instance_of;

public class InstanceDemo3 {
	public static void main(String[] args) 
	{
		String str = "india";
		if (str instanceof String  ) {
			System.out.println("str pointing to String Object");
		}
		
		Integer i = 90;
		if (i instanceof Number) {
			System.out.println("i is pointing to Integer Object");
		}
	}

}
