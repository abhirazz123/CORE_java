package DIC_16;

@FunctionalInterface
interface Cube1
{
	int cube(int b);

}


public class FunctionalInterface2 {
	
	public static void main(String[] args) {
		int a = 22;
		
		Cube1 cube = b -> b*b*b;
		System.out.println(cube.cube(a));
	}
}
