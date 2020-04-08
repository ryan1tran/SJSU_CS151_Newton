package hw;

import java.io.*;
import java.util.*;
import java.lang.Thread;

public abstract class Shape2D extends Thread implements Serializable
{
	float height;
	
	public Shape2D(float height)
	{
		this.height = height;
	}

	public float getHeight()
	{
		return height;
	}
	
	public void setHeight(float height)
	{
		this.height = height;
	}
	
	abstract float computeArea();
	
	@Override
	public void start()
	{
		Thread thread = new Thread(this);
		thread.start();
	}
	
	@Override
	public void run()
	{
		System.out.println(this + " has an area of " + this.computeArea());
	}
	
	public static <T> void serialize(List<T> shapeList) throws IOException
	{
		for (int i = 0; i < shapeList.size(); i++)
		{
			FileOutputStream streamOut = new FileOutputStream("./obj" + (i + 1) + ".ser");
			ObjectOutputStream objectOutput = new ObjectOutputStream (streamOut);
			objectOutput.writeObject(shapeList.get(i));
			objectOutput.close();
			streamOut.close();
		}
	}
}
