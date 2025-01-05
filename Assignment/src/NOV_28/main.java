package NOV_28;

public class main {

	public static void main(String[] args) {
		Address add = new Address("HYD", "SR Nager", "DCB bank");
		Employee add1 = new Employee(1007, "Abhishek kumar", add);
		
		System.out.println(add1);
	}

}
