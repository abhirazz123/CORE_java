package OCT_16.Scanner_class;
//WAP to read a name from the Scanner class
import java.util.Scanner;
public class ReadName {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the no: ");
		String name = sc.nextLine();
		System.out.printf("Your name is :"+name);

	}

}
