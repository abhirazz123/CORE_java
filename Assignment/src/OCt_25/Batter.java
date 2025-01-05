package OCt_25;

public class Batter {
	private String name ;
	private int runs;
	private int matches;
	private double batting_avg;
	
	public  void batterDetails(String name, int runs, int matches) {
		if(matches<0 || runs<0) {
			System.out.println("Error");
		}
		this.name = name ;
		this.runs = runs;
		this.matches = matches;
		this.batting_avg = computeBattingAverage();
	}
	public double computeBattingAverage() {
		if ( matches == 0) {
			System.err.println("please Enter the Valid match XXX");
		}
	return (double)runs/matches;
	}
	 public void getStatistics() {
	        System.out.println("Name: " + name);
	        System.out.println("Runs: " + runs);
	        System.out.println("Matches: " + matches);
	        System.out.printf("Batting Average: %.2f%n", batting_avg);
}
}
