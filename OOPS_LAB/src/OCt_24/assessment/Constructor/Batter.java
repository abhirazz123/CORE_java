package OCt_24.assessment.Constructor;

public class Batter 
{

	private String name ;
	private int run;
	private int matches;
	private float batting_avg;
	
	public void batterDetails(String name, int run,int matches) 
	{
		if (run<0 || matches <0 ) {
			System.out.println("Error");
		}
		if(matches ==0 && run >0 ) {
			System.out.println("Error");
		}
		this.name = name;
		this.run = run ;
		this.matches = matches;
	
		
	}
	public void computeBattingAverage() {
		batting_avg = (float)run/ matches;
		System.out.println("Batting_Avg: "+batting_avg);
	}
	public void DisplybatterDetails() {
		System.out.println("Name = "+name);
		System.out.println("Run= "+run);
		System.out.println("Matches = "+matches);
		//System.out.println("Batting_Ag = "+batting_avg);
		
	}
	
}