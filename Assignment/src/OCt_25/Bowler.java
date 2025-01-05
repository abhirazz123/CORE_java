package OCt_25;

public class Bowler {
	private String Name;
	private double wickets;
	private double matches;
	private double balls_bowled;
	private double runs_conceded;
	
	public void bowlerDetails(String Name, double wickets, double matches, double balls_bowled, double runs_conceded)
	{
		if (wickets<0 || matches <0 || balls_bowled<0 ||runs_conceded<0 ) {
		System.err.println("Error");
		return;
		}
		if((balls_bowled>0 || runs_conceded>0 ) && matches==0 ) {
			System.err.println("Error");
		}
			
		this.Name = Name;
		this.wickets = wickets;
		this.matches = matches;
		this.balls_bowled = balls_bowled;
		this.runs_conceded = runs_conceded;
	
	}
	public void computeBowlingAverage() {
		if (wickets<0) {
			System.err.println("Error");
			return;
		}
		double bowling_avg = runs_conceded/balls_bowled;
		System.out.println("Name :"+Name );
		System.out.printf("Bowling Average = %.1f%n",bowling_avg);
		
		
	}
	public void computeStrikeRate() {
		if(balls_bowled<0) {
			System.err.println("Error");
		}
		double strike_rate =  runs_conceded / balls_bowled;
		System.out.println("Name : "+Name);
		 System.out.printf("Strike Rate = %.8f%n", strike_rate);
	}
	
	  public void showStatistics() {
	        if (wickets < 0 || matches < 0 || balls_bowled < 0 || runs_conceded < 0) {
	            System.out.println("Error");
	            return;
	        }
	        if ((runs_conceded > 0 || balls_bowled > 0) && matches == 0) {
	            System.out.println("Error");
	            return;
	        }
	        System.out.println("Name = " + Name);
	        System.out.println("Wickets = " + wickets);
	        System.out.println("Matches = " + matches);
	        System.out.println("Balls Bowled = " + balls_bowled);
	        System.out.println("Runs Conceded = " + runs_conceded);
	  }

}
