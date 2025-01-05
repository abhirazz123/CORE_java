package DIC_03.Method_Overriding;
class Test15
{
	public void accept(String x) {
		System.out.println("String");
	}
	public void accept(Object y) {
		System.out.println("Object");
	}
}

public class AmbiguityDemo15 {
	public static void main(String[] args) {
		Test15 T15 = new Test15();
		T15.accept("abhi");
		T15.accept(null);
		T15.accept((Object)null);
	}

}
