package NOV_28;
/*class Demo {
	int x; //10
	int y; //11
	public Demo() {
		x = 10;
		y = x++;//10
		x = this.y + this.x;//11+10=21
		this.y = x + this.y;//21+10=31
	}
	public Demo(int x, int y) {
		this.x = this.x + x;   
		this.y = this.x + y;  
	}
}
public class Test {
	public static void main(String[] args) {
		
		System.out.print(new Demo().x + new Demo().y);
		Demo demo = new Demo(20, 45);                             
		System.out.print(" " + demo.x + " " + demo.y + " " + (new Demo().x - demo.y));
	}
}*/







	class Demo {
		int x;
		int y;
		public Demo() {
			x = 10;
			y = x++;
		}
		public Demo(int x, int y) {
			this.x = this.x+(this.x + x++);
			this.y = this.y-(this.x + --y);
		}
	}
	public class Test {
		public static void main(String[] args) {
			                                
			System.out.println(new Demo().x + new Demo().y);
			Demo demo = new Demo(30, 50);
			                                         
			System.out.print(" " + demo.x + " " + demo.y + " " + (new Demo().x - demo.y));
		}
	}
