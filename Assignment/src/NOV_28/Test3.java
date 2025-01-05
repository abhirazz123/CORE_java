package NOV_28;
class testdemo 
{
	int x = 10;
	int y = 20;
	public testdemo() 
	{
		x = 90;
		y = y + 80;//100
	}
}
public class Test3 {
	public static void main(String[] args) 
	{
		testdemo e1 = new testdemo();
		testdemo e2 = new testdemo();
		e2.x=25;
		e1.x =e2.y+10;//100+10=>100
		
		System.out.println(e1.x + " " + e1.y);//110 100
	
		System.out.println(e2.x + " " + e2.y);//25 100
	}

}
