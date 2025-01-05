package OCt_29;

class calculate {
   
	public int calculateArea(int sideLength) 
	{
		
		if (sideLength<0) {
			System.out.println("Error: Side length must be non-negative.");
		}
		return sideLength*sideLength;
	}

	public int calculateArea(int length, int width )
	{
		if (length<0 || width<0) 
	{
		System.out.println("Error: Length and width must be non-negative");
	}
		return length*width;
	
	}
	public double calculateArea(double radius) 
	{
		if(radius<=0) {
			System.out.println("Error: radius must be non-negative.");
		}
		return Math.PI *radius*radius;
	}


}
public class ShapeCalculator {
    public static void main(String[] args) {
    	calculate C = new calculate();
    	double circleArea = C.calculateArea(7.0);
    	System.out.printf("Area of circle with radius 7.0: %.2f%n", circleArea);

    	
    	int squareArea = C.calculateArea(7); 
    	if (squareArea != -1) { 
    		System.out.println("Area of square with side length : " + squareArea);
    	}
    	
    	double rectangleArea = C.calculateArea(-5, 10);
    	
    }
}
