package OCT_17.Switch_Demo;
import java.util.*;
public class SwitchDemo1 {

	public static void main(String[] args) {
		System.out.println("\t\t**Main menu**\n");
		System.out.println("\t\t**100 polic**\n");
		System.out.println("\t\t**101 Fire**\n");
		System.out.println("\t\t**102 Ambulance**\n");
		System.out.println("\t\t**139 Railway**\n");
		System.out.println("\t\t**181 Women'n Helpline**\n");
		
		System.out.println("Enter your choice:");
		Scanner sc = new Scanner (System.in);
		int choice = sc.nextInt();
		
		switch(choice) {
		case 100:System.out.println("polic Services");break;
		case 101:System.out.println("Fire Services");break;
		case 102:System.out.println("Ambulance Services");break;
		case 139:System.out.println("women'Helpline Services");break;
		case 181:System.out.println("polic Services");break;
		default: System.out.println("not valid Services");break;
		
		}
		
	}

}
