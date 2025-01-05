package OCt_25;
import java.util.*;
public class BatterDemo {
	public static void main(String[] args) {
		Batter Bol = new Batter();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Name :");
		String Name = sc.nextLine();	
		
		System.out.println("Enter the runs: ");
		int runs = sc.nextInt();
		
		System.out.println("Enter the matches: ");
		int matches = sc.nextInt();
		Bol.batterDetails(Name, runs, matches);
		Bol.getStatistics();
		
		
		
		
		
		
	
		
	}

}
