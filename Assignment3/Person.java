package hw3;

public class Person
{
	String firstName;
	String lastName;
	int age;
	int socialSecurity;
	Address address;
	String gender;
	float weight;
	String education;
	int id;
	boolean accommodations;
	String status;
	
	
	public Person()
	{
		this.firstName = null;
		this.lastName = null;
		this.age = -1;
		this.socialSecurity = -1;
		this.address = null;
		this.gender = null;
		this.weight = -1;
		this.education = null;
		this.id = -1;
		this.accommodations = false;
		this.status = null;
	}
	
	public Person(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = -1;
		this.socialSecurity = -1;
		this.address = null;
		this.gender = null;
		this.weight = -1;
		this.education = null;
		this.id = -1;
		this.accommodations = false;
		this.status = null;
	}
	
	public Person(String firstName, String lastName, Address address)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = -1;
		this.socialSecurity = -1;
		this.address = address;
		this.gender = null;
		this.weight = -1;
		this.education = null;
		this.id = -1;
		this.accommodations = false;
		this.status = null;
	}
	
	public Person(String firstName, String lastName, int age, int socialSecurity, Address address, String gender, float weight, String education, int id, boolean accommodations, String status)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.socialSecurity = socialSecurity;
		this.address = address;
		this.gender = gender;
		this.weight = weight;
		this.education = education;
		this.id = id;
		this.accommodations = accommodations;
		this.status = status;
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
	public Address getAddress()
	{
		return address;
	}
	public void setAddress(Address address)
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

	public String getEducation()
	{
		return education;
	}

	public void setEducation(String education)
	{
		this.education = education;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public boolean needsAccommodations()
	{
		return accommodations;
	}

	public void setAccommodations(boolean accommodations)
	{
		this.accommodations = accommodations;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}
}
