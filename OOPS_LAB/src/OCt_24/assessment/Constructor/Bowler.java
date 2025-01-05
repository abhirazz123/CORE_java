package OCt_24.assessment.Constructor;


public class Bowler {
  
    private String name;
    private int wickets;
    private int matches;
    private int balls_bowled;
    private int runs_conceded;

  
    public void bowlerDetails(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
        if (wickets < 0 || matches < 0 || balls_bowled < 0 || runs_conceded < 0) {
            System.out.println("Error");
            return;
        }
        if ((matches == 0) && (runs_conceded > 0 || balls_bowled > 0)) {
            System.out.println("Error");
            return;
        }
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;
    }

   
    public void computeBowlingAverage() {
        if (wickets <= 0) {
            System.out.println("Error");
            return;
        }
        double bowlingAverage = (double) runs_conceded / wickets;
        System.out.println("Name: " + name);
        System.out.println("bowling_avg=" + bowlingAverage);
    }

  
    public void computeStrikeRate() {
        if (balls_bowled <= 0) {
            System.out.println("Error");
            return;
        }
        double strikeRate = (double) runs_conceded / balls_bowled;
        System.out.println("Name: " + name);
        System.out.println("Strike_rate=" + strikeRate);
    }

   
    public void showStatistics() {
        System.out.println("Name=" + name);
        System.out.println("wickets=" + wickets);
        System.out.println("matches=" + matches);
        System.out.println("balls_bowled=" + balls_bowled);
        System.out.println("runs_conceded=" + runs_conceded);
    }
}



    