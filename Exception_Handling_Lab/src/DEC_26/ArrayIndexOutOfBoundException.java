package DEC_26;


public class ArrayIndexOutOfBoundException {
	public static void main(String[] args) {
		System.out.println("Main Method start....");
	
			
		try {
			int a[] = new int[2];
			 System.out.println(a[3]);
		
		}
		catch( ArrayIndexOutOfBoundsException e) {
			System.out.println("An ArrayIndexOutOfBoundsException ");
			System.out.println("Message: " + e.getMessage()); 
			System.out.println("String representation: " + e.toString());
			e.printStackTrace();
			
			
			
			
		}
	}
	
}
