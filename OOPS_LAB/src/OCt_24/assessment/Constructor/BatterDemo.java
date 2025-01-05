package OCt_24.assessment.Constructor;

public class BatterDemo {

	public static void main(String[] args) {
		Batter Batt = new Batter() ;
		Batt.batterDetails("Abhishek", 18000, 0);
		Batt.DisplybatterDetails();
		Batt.computeBattingAverage();

	}

}
