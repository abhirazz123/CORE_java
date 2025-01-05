package OCT_16.Scanner_class;
//WAP to read a character from Scanner class
import java.util.*;
public class ReadCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character :");
		char gen = sc.next().charAt(0);
		System.out.println("Your Gender is :"+gen);
		 
                sc.close();

	}

}
