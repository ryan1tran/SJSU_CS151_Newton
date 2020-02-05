package hw1;

public class Student
{
	private String firstName;
	private String lastName;
	private int age;
	private float gpa;
	private String major;
	private String department;
	
	public Student()
	{
		this.firstName = null;
		this.lastName = null;
		this.age = -1;
		this.gpa = -1;
		this.major = null;
		this.department = null;
	}
	
	public Student(String firstName, String lastName, int age, float gpa, String major, String department)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
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

	public float getGpa()
	{
		return gpa;
	}

	public void setGpa(float gpa)
	{
		this.gpa = gpa;
	}

	public String getMajor()
	{
		return major;
	}

	public void setMajor(String major)
	{
		this.major = major;
	}

	public String getDepartment()
	{
		return department;
	}

	public void setDepartment(String department)
	{
		this.department = department;
	}
	
	public class Course
	{
		public void printSchedule()
		{
			System.out.println("Course Schedule:\n"
							 + "MUSC28\n"
							 + "PHIL134\n"
							 + "CS49C\n"
							 + "CS147\n"
						 	 + "CS151\n"
							 + "CS166\n"
							 + "CS185C\n");
		}
	}
}
