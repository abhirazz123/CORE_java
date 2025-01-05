package OCT_16.Unary_Minus_Operator;

public class Test4 {

	public static void main(String[] args) {
	int z = 5;
	if (++z>5 || ++z>6) {
		z++;
	}
System.out.println(z);
System.out.println("=========================");
	z = 5;
	if (++z>5 | ++z>6) {
	
		z++;
		}
	System.out.println(z);
	}

}
