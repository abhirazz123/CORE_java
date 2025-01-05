package Day_6;
import java.util.Scanner;

public class Calculatecompoundinterest{
	public static void main(String []agrs){
	Scanner sc = new Scanner(System.in);
	
	System.out.printf("Enter the  principal balance(P)");
	 double p = sc.nextDouble();
	
	System.out.printf("Enter the interest rete  (R)");
	double r = sc.nextDouble();

double amount= p*((1+r/100)*(1+r/100)*(1+r/100));
double calculatecompoundinterest = amount-p;

 System.out.printf("The total amount after  years is: %.2f\n", amount);

System.out.printf("calculate compound interest:%.2f\n ",calculatecompoundinterest);
	
}

}