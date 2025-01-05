package OCt_18.BLC_and_ELC_class;

public  class Averagedemo {
	public static double calculateAverage(double[] numbers) {
		double sum = 0.0;
		for (double num :numbers) {
			sum +=num;
		}
		return sum / numbers.length;
		
	}
	
	

}
