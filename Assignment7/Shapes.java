package hw;

import java.util.*;
import java.io.*;

public class Shapes<T extends Shape2D>
{
	private List<T> shapeList;
	
	public Shapes()
	{
		shapeList = new ArrayList<>();
	}
	
	public void setShapeList(List<T> shapeList)
	{
		this.shapeList = shapeList;
	}

	public List<T> getShapeList()
	{
		return shapeList;
	}
	
	public void addShape(T shape)
	{
		shapeList.add(shape);
	}
	
	public void removeShape(T shape)
	{
		shapeList.remove(shape);
	}
	
	public synchronized void compute() throws InterruptedException
	{
		for (Shape2D shape : shapeList)
			shape.start();
		Thread.sleep(10);
	}
	
	public Shape2D max()
	{
		float max = Float.MIN_VALUE;
		int index = -1;
		for (int i = 0; i < shapeList.size(); i++)
		{
			float area = shapeList.get(i).computeArea();
			if (area >= max)
			{
				max = area;
				index = i;
			}
		}
		
		if (index == -1)
			return null;
		else
			return shapeList.get(index);
	}
	
	public Shape2D min()
	{
		float min = Float.MAX_VALUE;
		int index = -1;
		for (int i = 0; i < shapeList.size(); i++)
		{
			float area = shapeList.get(i).computeArea();
			if (area <= min)
			{
				min = area;
				index = i;
			}
		}
		
		if (index == -1)
			return null;
		else
			return shapeList.get(index);
	}
	
	public void serialize() throws IOException
	{
		Shape2D.serialize(getShapeList());
	}
}
