package OCT_17.for_each_loop;

import java.util.Arrays;

public class Calculate_the_Average {

	public static void main(String[] args) {
		double number []= {5.0, 10.0, 15.0, 20.0};
		double sum = 0;
		for(double num :number) {
			sum +=num;
		}
		double Average = sum/number.length;
		System.out.println("Average = "+Average);

	}

}
