package OCt_25;
import java.util.*;
public class BowlerDemo {
	public static void main(String[] args) {
		Bowler bol = new Bowler();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter the Wickets : ");
		double wickets = sc.nextDouble();
		
		System.out.println("Enter the matches : ");
		double matches = sc.nextDouble();
		
		System.out.println("Enter the balls_bowled : ");
		double balls_bowled = sc.nextDouble();
		
		System.out.println("Enter the runs_conceded : ");
		double runs_conceded = sc.nextDouble();
		
		bol.bowlerDetails(name, wickets, matches, balls_bowled, runs_conceded);
		System.out.println("\nChoose an operation:");
        System.out.println("1. Compute Bowling Average");
        System.out.println("2. Compute Strike Rate");
        System.out.println("3. Show Statistics");
        
        int choice = sc.nextInt();
        
        switch(choice) {
        case 1 :
        	bol.computeBowlingAverage();break;
        case 2 :
        	bol.computeStrikeRate();break;
        case 3:
        	bol.showStatistics();break;
        default:
            System.out.println("Invalid choice.");
        }
       
        	
		
	}

}
