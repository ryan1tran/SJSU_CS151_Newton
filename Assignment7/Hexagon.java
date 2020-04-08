package hw;

public class Hexagon extends Shape2D
{
	public Hexagon(float heightOfSide)
	{
		super(heightOfSide);
	}
	
	public float computeArea()
	{
		return (float)(3 * Math.cbrt(3) / 2 * Math.pow(getHeight(), 2));
	}
	
	@Override
	public String toString()
	{
		return "Hexagon with height of side " + getHeight();
	}
}
