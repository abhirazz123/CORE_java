package Day_6;
/*import java.util.Scanner;
public class ConvertFahrenheit {
	public static void main(String []args){
	Scanner sc = new Scanner (System.in);
	System.out.printf("Enter the  Fahrenheit: ");

	double Fahrenheit= sc.nextDouble();
	double Celsius=(Fahrenheit-32)*5/9;

	System.out.printf("Celsius:%.2f\n",Celsius);



	}
}*/

import java.util.Scanner;
public class /*ConvertCelsius*/ ConvertFahrenheit {
	public static void main(String []args){
	Scanner sc = new Scanner (System.in);
	System.out.printf("Enter the  Fahrenheit: ");

	double Celsius= sc.nextDouble();
	double Fahrenheit=((9*Celsius)/5)+32;

	System.out.printf("Fahrenheit:%.2f\n",Fahrenheit);



	}
}