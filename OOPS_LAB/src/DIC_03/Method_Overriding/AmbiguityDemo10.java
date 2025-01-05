package DIC_03.Method_Overriding;

class Test10
{
	public void accept(int b , int i) {
		System.out.println("int-int");
		
	}
	public void accept(byte i, int b) {
		System.out.println("byte-int");
	}
	public void accept(byte b1 , byte b2) {
		System.out.println("Byte-byte");
	}
}
public class AmbiguityDemo10
{
	public static void main(String[] args) {
		Test10 T10 = new Test10();
		byte b1 = 1;
		byte b2 = 2;
		T10.accept(b1, b2);
	}
	
}
