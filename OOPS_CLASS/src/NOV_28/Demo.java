package NOV_28;																					//52 20 65 -44



class me 
{
	int x;
	int y;
	public me()
	{
		x = 10;
		y =x++;
		x = this.y + this.x;
		this.y = x + this.y;
	}
	public me(int x, int y)
	{
		this.x = this.x + x;
		this.y = this.x + y;
	}
}
public class Demo {

	public static void main(String[] args) 
	{
		System.out.println(new me().x + new me().y);
		me my = new me(20,45);
		
		//System.out.println(" "+ me. x +" "+ me.y +" "(new me().x + new me().y));
		 System.out.println(" " + my.x + " " + my.y + " " + (new me().x - my.y));
	}

}