package NOV_30.Unboxing;

class Test8
{
	public void accept(byte d) 
	{
		System.out.println("byte");
	}
	public void accept(short s) 
	{
		System.out.println("short");
	}
}

public class AmbiguityIssue7 {

	public static void main(String[] args) 
	{
		Test8 T7 = new Test8();
		//T7.accept(15);// error:- Here value 15 is of type int so, we can't assign directly to byte and short, If we want, explicit type casting is reqd.
		T7.accept((byte)15);
		T7.accept((short)15);
	}

}
