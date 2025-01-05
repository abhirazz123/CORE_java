package NOV_30.Unboxing;
class teat18
	{
		public void accept(Number n) {
			System.out.println("number");
		}
		public void accept(Double d) {
			System.out.println("Double");
		}
	}

public class AmbiguityIssue19 
{
	public static void main(String[] args) 
	{
		teat18 t = new teat18();
		t.accept(12);
	}
}
