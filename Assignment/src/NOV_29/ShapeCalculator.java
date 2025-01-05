package NOV_29;

public class ShapeCalculator 
{
	  public double calculateArea(int sideLength) 
	  {
	        if (sideLength < 0) {
	            System.out.println("Error: Side length must be non-negative.");
	            return -1;
	        }
	        return sideLength * sideLength;
	    }
	  public int calculateArea(int length, int width ) 
	  {
		  if ( length<0 || width<0) {
			  System.out.println("Error: length width must be non-negative.");
			  return -1;
		  }
		  return length*width;
	  }
	  public double calculateArea(double radius  ) {
		  if(radius<0) {
			  System.out.println("Error: radius  must be non-negative.");  
		  }
		  	return Math.PI*radius*radius;
	  }
}
