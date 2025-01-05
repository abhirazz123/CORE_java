package OCT_17.Switch_Demo;
import java.util.*;
public class SwitchDemo{

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the charctor = ");
		char colour = sc.next().toLowerCase().charAt(0);
		
		switch(colour) {
		case 'r':System.out.println("red");break;
		case 'b':System.out.println("bulu");break;
		case 'w':System.out.println("white");break;
		case 'a':System.out.println("black");break;
		default :System.out.println("no colure");
		
		}
		System.out.println("complet");
	}
	
}