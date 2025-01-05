package OCT_04;
//WAP to show how exactly Integer.parseInt works internally ?
class Integer{
	public static int getSquar(int num) {
		return num*num;
	}
	public static int getcube(int num) {
		return num*num*num;
	}
}

public class IntegerClassDemo {
	public static void main (String []args) {
		int Squar = Integer.getSquar(15);
		System.out.println("Squae is = "+Squar);
		
		int cube = Integer.getcube(15);
		System.out.println("Squae is = "+cube);
		
		
		
	
	}
}
