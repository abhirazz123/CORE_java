package DIC_05.Method_Hiding;

class Parentt
{
	public static void show()
	{
		System.out.println("show matheod of Parent class");
	}
}
class child extends Parentt
{

}
public class MethodHidingDemo1 
{

	public static void main(String[] args)
	{
		child.show();
		Parentt.show();
		     //or  
		
		
		/*child  c = new child ();
		c.show();
		
		   //or
		Parentt p = new Parentt();
		p.show();
		*/
	}

}
