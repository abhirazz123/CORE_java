package NOV_29;

public class Main
{
public static void main(String[] args) 
{
	ShapeCalculator A = new ShapeCalculator();
	
	double areaofacircle =   A.calculateArea(7.0);
	if (areaofacircle !=-1) 
	{
		  System.out.printf("Area of circle with radius 7.0: %.5f\n", areaofacircle);
		  
		  
	}
	double squareArea = A.calculateArea(-5);
    if (squareArea != -1) {
        System.out.printf("Area of square with side length -5: %.2f\n", squareArea);
    }
    double rectangle = A.calculateArea(5, 10);
    if (rectangle!=-1)
    {
    	System.out.printf("Area of rectangle with length -5 and width 10: %.2f\n", rectangle);
    }
}


	
}

