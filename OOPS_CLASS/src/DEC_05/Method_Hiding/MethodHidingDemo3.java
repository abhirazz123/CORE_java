/*Case 3 :

We can't override any non static method with static method, If we try then it will generate an error, Overriding method is static.
*/



package DEC_05.Method_Hiding;

class super1 {
	public void m1() { // object
		
	}
}

class sub extends super1{
	
	public static void m1() { //class
		

	}
}
public class MethodHidingDemo3 {

	public static void main(String[] args) {
		System.out.println("Hellow World");

	}

}
