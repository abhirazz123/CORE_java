package OCt_25.variable_copy_demo;

public class Demo {

	
		static int x = 100; //static field
		public static void main(String[] args) 
		{
			Demo d1 = new Demo();
			Demo d2 = new Demo();
			
			--d1.x;   --d2.x;
			
			System.out.println(d1.x);  //98
			System.out.println(d2.x); //98
		}
	}
