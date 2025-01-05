package OCt_24.assessment.Constructor;

public class BowlerDemo {

	public static void main(String[] args) {
        Bowler bowler = new Bowler();
        
       
        bowler.bowlerDetails("Sachin", 10, 5, 750, 463);

        bowler.showStatistics();

       
        bowler.computeBowlingAverage();

        bowler.computeStrikeRate();
    }
}

