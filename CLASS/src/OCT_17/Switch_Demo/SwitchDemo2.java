package OCT_17.Switch_Demo;
import java.util.*;
public class SwitchDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Entday your day:");
		String sesion = sc.next().toLowerCase();
		
		switch(sesion) {
		case ("summer"):System.out.println("this is summer");
			break;
		case"rainy":System.out.println("this this is rainy");
			break;
		case "wintar":System.out.println("this time is wintar");
			break;
		default:System.out.println("invlid");
		}
		System.out.println("complite");

	}

}
