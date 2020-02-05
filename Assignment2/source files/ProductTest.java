package hw1;

public class ProductTest
{
	public static void main(String[] args)
	{
		Product p = new Product("Goldfish", "The snack that smiles back!", 200);
		System.out.println(p.getProductName() + ": " + p.getProductDesc());
		System.out.println("Customer opinion: " + p.toString("yummy"));
	}
}
