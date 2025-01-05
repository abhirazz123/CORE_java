package Day_3;
public class twodigitnumber{
	public static void main(String[]args){

int n= Integer.parseInt(args[0]);
int a = n/10;
int b = n%10;
int sum = a+b;
System.out.println("two digit number=" + n+"\ntwo digit sum="+sum);
}
}