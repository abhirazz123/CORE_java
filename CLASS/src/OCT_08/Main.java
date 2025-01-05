package OCT_08;
/* By default every integral literal is of type int only*/
public class Main {

	public static void main(String[] args) {
		//byte b = 128;//error
		byte b = (byte) 128;
				System.out.println(b);
		//short s = 32768; // error
		short s = (short) 32768;
	}

}
