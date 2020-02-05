package hw1;

public class Dog extends Animal implements DomesticatedAnimal, Swimmer
{
	public Dog(String type, String name, int age, String gender, String environment, int speed)
	{
		super(type, name, age, gender, environment, speed);
	}
	
	@Override
	public void sound()
	{
		System.out.println("Woof!");
	}
	
	@Override
	public void eat()
	{
		System.out.println("chomp chomp");
	}
	
	public void walk()
	{
		System.out.println("Going for a walk!");
	}
	
	public void greetHuman()
	{
		System.out.println("Woof woof!");
	}
	
	public void bark()
	{
		System.out.println("Bark bark!");
	}
	
	public void swim()
	{
		System.out.println("Swimming!");
	}
}
