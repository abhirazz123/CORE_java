package OCT_17.for_each_loop;

public class How_to_sort_Array_data {

	public static void main(String[] args) {
		String cities[]= {"Hyd","Pune","Ajmer","Mumbai"};
		java.util.Arrays.sort(cities);
		for(String city:cities) {
			System.out.println(city);
		}

	}

}
