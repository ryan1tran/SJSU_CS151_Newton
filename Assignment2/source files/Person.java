package hw1;

public class Person
{
	String firstName;
	String lastName;
	int age;
	int socialSecurity;
	String address;
	String gender;
	float weight;
	
	public Person()
	{
		this.firstName = null;
		this.lastName = null;
		this.age = -1;
		this.socialSecurity = -1;
		this.address = null;
		this.gender = null;
		this.weight = -1;
	}
	
	public Person(String firstName, String lastName, int age, int socialSecurity, String address, String gender, float weight)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.socialSecurity = socialSecurity;
		this.address = address;
		this.gender = gender;
		this.weight = weight;
	}
	
	public String toString(String mood)
	{
		return "I'm " + mood + ".";
	}
	
	public void introduce()
	{
		System.out.println("I am " + firstName + " " + lastName + ", a " + age + " year old " + gender + "!");
	}

	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getSocialSecurity()
	{
		return socialSecurity;
	}
	public void setSocialSecurity(int socialSecurity)
	{
		this.socialSecurity = socialSecurity;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public float getWeight()
	{
		return weight;
	}
	public void setWeight(float weight)
	{
		this.weight = weight;
	}
}
