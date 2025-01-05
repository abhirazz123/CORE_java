package DEC_04;
import java.util.*;
class Shape
{
	public Shape() 
	{
		
	}
	public void draw() 
	{
		System.out.println("Shape draw");
	}
	public void erase() 
	{
		System.out.println("Shape erase");
	}
	public static Shape randshape() 
	{
		int randomNum = (int) (Math.random()*3); 
		switch(randomNum) 
		{
		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2:
            return new Triangle();
        default:
        	System.out.println("Default case: Returning Shape");
            return new Shape();
		}
		
	}
}
class Circle extends Shape{
	public Circle() {
		
	}
	@Override
	public void draw () {
		System.out.println("Circle draw");
	}
	public void erase() {
		System.out.println("Circle erase");
	}
}
class Square extends Shape{
public Square() {
		
	}
	public void draw() {
		System.out.println("Square draw");
	}
	public void erase() {
		System.out.println("Square erase");
	}
}
class Triangle extends Shape{
	public Triangle() {
		
	}
	
	@Override
	
	public void draw() {
		System.out.println("Triangle draw");
	}
	public void erase() {
		System.out.println("Triangle erase");
	}
}
public class ShapeDemo 
{
	public static void main(String[] args) 
	{
		for(int i = 0 ; i<4; i++) {
			 Shape shape = Shape.randshape();
			 shape.draw();
			 shape.erase();
			
		}
		
	}
}
