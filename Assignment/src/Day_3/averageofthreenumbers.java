package Day_3;
public class averageofthreenumbers{
	public  static void  main(String []args){
	double a= Double.parseDouble(args[0]);
	double b=Double.parseDouble(args[1]);
	double c=Double.parseDouble(args[2]);
	
	double Sum = a+b+c;
	double Avg = Sum/3;
System.out.println("Sum of three numbers="+Sum);	
System.out.println("average of three numbers="+Avg);
}
}