package hw1;

public final class Product
{
	private final String productName;
	private final String productDesc;
	private final int maxQuantity;
	
	public Product(String productName, String productDesc, int maxQuantity)
	{
		this.productName = productName;
		this.productDesc = productDesc;
		this.maxQuantity = maxQuantity;
	}
	
	public String getProductName()
	{
		return productName;
	}
	
	public String getProductDesc()
	{
		return productDesc;
	}
	
	public int getMaxQuantity()
	{
		return maxQuantity;
	}
	
	public String toString(String opinion)
	{
		return productName + " is " + opinion + "!";
	}
}
