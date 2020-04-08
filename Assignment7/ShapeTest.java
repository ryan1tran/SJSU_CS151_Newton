package hw;

import java.io.*;

public class ShapeTest
{
	public static void main(String[] args) throws IOException
	{
		Shapes s = new Shapes();
		
		s.addShape(new Triangle(5, 10));
		s.addShape(new Triangle(3.6f, 2.9f));
		s.addShape(new Circle(5));
		s.addShape(new Circle(7.8f));
		s.addShape(new Rectangle(3, 2));
		s.addShape(new Rectangle(4.4f, 5.5f));
		s.addShape(new Hexagon(8));
		s.addShape(new Hexagon(6.5f));
		
		s.compute();
		System.out.println();
		
		Shape2D largest = s.max();
		Shape2D smallest = s.min();
		
		if (largest == null)
			System.out.println("List is empty: no largest shape.");
		else
			System.out.println("The largest shape is a " + largest);
		
		if (smallest == null)
			System.out.println("List is empty: no smallest shape.");
		else
			System.out.println("The smallest shape is a " + smallest);
		
		s.serialize();
	}
}
