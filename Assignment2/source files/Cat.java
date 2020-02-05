package hw1;

public class Cat extends Animal implements DomesticatedAnimal, Swimmer, Scratcher
{
	public Cat(String type, String name, int age, String gender, String environment, int speed)
	{
		super(type, name, age, gender, environment, speed);
	}
	
	@Override
	public void sound()
	{
		System.out.println("Meow!");
	}
	
	@Override
	public void eat()
	{
		System.out.println("nom nom");
	}
	
	public void walk()
	{
		System.out.println("Going for a stroll!");
	}
	
	public void greetHuman()
	{
		System.out.println("Meow meow!");
	}
	
	public void scratch()
	{
		System.out.println("scritch scratch");
	}
	
	public void swim()
	{
		System.out.println("Swimming!");
	}
}
