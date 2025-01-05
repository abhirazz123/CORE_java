package OCt_18.BLC_and_ELC_class;

public class Calculate1Demo {
	public static int CalculateOfcube(int num) {
		if (num <=0) {
			return -1;
		}else if (num % 2 ==0) {
			return num*num;
		}else {
			return num*num*num;
		}
	}

}
