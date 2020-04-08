package hw;

public class Rectangle extends Shape2D
{
	float width;
	
	public Rectangle(float height, float width)
	{
		super(height);
		this.width = width;
	}

	public float getWidth()
	{
		return width;
	}

	public void setWidth(float width)
	{
		this.width = width;
	}
	
	public float computeArea()
	{
		return getWidth() * getHeight();
	}
	
	@Override
	public String toString()
	{
		return "Rectangle with height " + getHeight() + " and width: " + getWidth();
	}
}
