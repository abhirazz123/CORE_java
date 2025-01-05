package OCT_09;

public class Test7 {

	public static void main(String[] args) {
		double a = 1.5e3;  
		   //float b = 1.5e3; //error 
		   float b = (float) 1.5e3;
		   float c = 1.5e3F; 	   
		   double d = 10; 
		   int e = (int) 10.0;   
		   //int e = 10.0; //error
		   long f = (long) 10D;
		   //long f = 10D; //error  
		   int g = (int) 10F;   
		   //int g = 10F;   //error 
		   long l = (long) 12.78F; 
		   //long l = 12.78F; //error
		   System.out.println(a);
		   System.out.println(b);
		   System.out.println(c);
		   System.out.println(d);
		   System.out.println(e);
		   System.out.println(f);
		   System.out.println(g);
		   System.out.println(l);
		   


	}

}
