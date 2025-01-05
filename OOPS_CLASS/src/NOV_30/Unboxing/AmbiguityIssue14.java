package NOV_30.Unboxing;

class Beta
{
	}
	class Alpha extends Beta
	{
		
	}
	class Test15
	{
		public void accept(Beta i) 
		{
			System.out.println("Beta");
		}
		public void accept(Alpha s)
		{
			System.out.println("Alpha");
		}
		
	}


public class AmbiguityIssue14
{

	public static void main(String[] args) 
	{
		Test15 t = new Test15();
		t.accept(null);
				

	}

}
