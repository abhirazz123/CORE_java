package DEC_24.exception;

public class Main {

	public static void main(String[] args) {
		try
		{
			//System.out.println(10/0);
			throw new ArithmeticException("i am dividing no by zero");
		}
		catch(Exception e) {
			System.out.println("Inst catch Block");
			System.out.println(e);
		}

	}

}
