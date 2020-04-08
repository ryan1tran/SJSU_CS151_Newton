package hw;

public class Circle extends Shape2D
{
	public Circle(float height)
	{
		super(height);
	}
	
	public float computeArea()
	{
		return (float)(Math.PI * Math.pow(getHeight()/2, 2));
	}
	
	@Override
	public String toString()
	{
		return "Cirle with diameter " + getHeight();
	}
}
