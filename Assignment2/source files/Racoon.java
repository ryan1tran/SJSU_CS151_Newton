package hw1;

public class Racoon extends Animal implements DomesticatedAnimal, Swimmer, Scratcher // some people have racoons as pets!
{
	public Racoon(String type, String name, int age, String gender, String environment, int speed)
	{
		super(type, name, age, gender, environment, speed);
	}
	
	@Override
	public void sound()
	{
		System.out.println("tchtchtch");
	}
	
	@Override
	public void eat()
	{
		System.out.println("*sounds of digging through garbage");
	}
	
	public void walk()
	{
		System.out.println("Going for a trash sniffing!");
	}
	
	public void greetHuman()
	{
		System.out.println("Tchtch!");
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
