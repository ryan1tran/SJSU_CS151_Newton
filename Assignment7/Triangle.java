package hw;

public class Triangle extends Shape2D
{
	float width;
	
	public Triangle(float height, float width)
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
		return getWidth() * getHeight() / 2;
	}
	
	@Override
	public String toString()
	{
		return "Triangle with height " + getHeight() + " and width: " + getWidth();
	}
}
