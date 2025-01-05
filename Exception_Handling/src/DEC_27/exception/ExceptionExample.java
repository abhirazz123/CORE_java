package DEC_27.exception;

public class ExceptionExample {

	public static void main(String[] args) {
	  try {
		  String str = null;
		  System.out.println(str.length());
		  
	  }catch(NullPointerException e ) {
		  System.out.println("NullpointerException occurred");
		  
	  }
	  finally {
		System.out.println("End of program.");
	}

	}

}
