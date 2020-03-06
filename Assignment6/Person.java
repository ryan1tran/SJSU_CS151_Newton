package hw6;

import java.util.*;

public class Person
{
	String firstName;
	String lastName;
	int age;
	
	
	public Person(String firstName, String lastName, int age)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
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
	
	public static void main(String[] args)
	{
		ArrayList<Person> list = new ArrayList<>();
		
		list.add(new Person("Joe", "Smith", 40));
		list.add(new Person("Amy", "Gold", 32));
		list.add(new Person("Tony", "Stork", 21));
		list.add(new Person("Sean", "Irish", 24));
		list.add(new Person("Tina", "Brock", 28));
		list.add(new Person("Lenny", "Hep", 18));
		
		Collections.sort(list, new Comparator<Person>()
		{
			public int compare(Person p1, Person p2)
			{
				if (p1.getAge() < p2.getAge())
					return -1;
				else if (p1.getAge() > p2.getAge())
					return 1;
				else
					return 0;
			}
		});
		
		System.out.println("Sorted ascending by age:\n");
		for (Person p : list)
			System.out.println(p.getFirstName() + " " + p.getLastName() + ": " + p.getAge() + " years old.");
		
		System.out.println("---------------------------------\n");
		
		Collections.sort(list, new Comparator<Person>()
		{
			public int compare(Person p1, Person p2)
			{
				if (p1.getAge() < p2.getAge())
					return 1;
				else if (p1.getAge() > p2.getAge())
					return -1;
				else
					return 0;
			}
		});
		
		System.out.println("Sorted descending by age:\n");
		for (Person p : list)
			System.out.println(p.getFirstName() + " " + p.getLastName() + ": " + p.getAge() + " years old.");
		
		System.out.println("---------------------------------\n");
		
		Collections.sort(list, new Comparator<Person>()
		{
			public int compare(Person p1, Person p2)
			{
				return p1.getFirstName().compareTo(p2.getFirstName());
			}
		});
		
		System.out.println("Sorted alphabetically by first name:\n");
		for (Person p : list)
			System.out.println(p.getFirstName() + " " + p.getLastName() + ": " + p.getAge() + " years old.");
		
		System.out.println("---------------------------------\n");
		
		Collections.sort(list, new Comparator<Person>()
		{
			public int compare(Person p1, Person p2)
			{
				return p2.getFirstName().compareTo(p1.getFirstName());
			}
		});
		
		System.out.println("Sorted reverse-alphabetically by first name:\n");
		for (Person p : list)
			System.out.println(p.getFirstName() + " " + p.getLastName() + ": " + p.getAge() + " years old.");
		
		System.out.println("---------------------------------\n");
		
		Collections.sort(list, new Comparator<Person>()
		{
			public int compare(Person p1, Person p2)
			{
				if (p1.getLastName().length() < p2.getLastName().length())
					return -1;
				else if (p1.getLastName().length() > p2.getLastName().length())
					return 1;
				else
					return 0;
			}
		});
		
		System.out.println("Sorted ascending by last name length:\n");
		for (Person p : list)
			System.out.println(p.getLastName() + ", " + p.getFirstName() + ": " + p.getAge() + " years old.");
		
		System.out.println("---------------------------------\n");
		
		Collections.sort(list, new Comparator<Person>()
		{
			public int compare(Person p1, Person p2)
			{
				if (p1.getLastName().length() < p2.getLastName().length())
					return 1;
				else if (p1.getLastName().length() > p2.getLastName().length())
					return -1;
				else
					return 0;
			}
		});
		
		System.out.println("Sorted descending by last name length:\n");
		for (Person p : list)
			System.out.println(p.getLastName() + ", " + p.getFirstName() + ": " + p.getAge() + " years old.");
		
		System.out.println("---------------------------------\n");
	}
}
