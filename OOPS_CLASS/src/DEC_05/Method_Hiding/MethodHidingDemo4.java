/* Case 4 :

Program that describes method hiding concept as well as  sub class method can't hide super class method because return type is not compatible
*/




package DEC_05.Method_Hiding;
class Super4{
	public  static int m1() //class
	{
		
		
	}
}
class sub4 extends Super4{
	public static int m1() {
		return 0;
		
	}
}


public class MethodHidingDemo4 {
	public static void main(String[] args) {
		
	}

}
