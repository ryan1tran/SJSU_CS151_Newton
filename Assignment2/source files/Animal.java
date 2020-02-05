package hw1;

public abstract class Animal
{
	String type;
	String name;
	int age;
	String gender;
	String environment;
	int speed;
	
	public Animal(String type, String name, int age, String gender, String environment, int speed)
	{
		super();
		this.type = type;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.environment = environment;
		this.speed = speed;
	}
	
	public void move()
	{
		System.out.println("Zooming at " + speed + " mph!");
	}
	
	public void sleep()
	{
		System.out.println("zzz");
	}
	
	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	public String getEnvironment()
	{
		return environment;
	}

	public void setEnvironment(String environment)
	{
		this.environment = environment;
	}

	public int getSpeed()
	{
		return speed;
	}

	public void setSpeed(int speed)
	{
		this.speed = speed;
	}

	public void sound() {}
	public void eat() {}
}
