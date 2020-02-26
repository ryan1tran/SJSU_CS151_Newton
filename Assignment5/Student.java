package hw5;

public class Student
{
	private String firstName;
	private String lastName;
	private int age;
	private float gpa;
	private String major;
	private String department;
	private Course cs185c = new Course("CS185C", "Advanced Practical Computing Topics", "CS", "12:00pm - 1:15pm", Day.Tu);
	private Course cs49c = new Course("CS49C", "Programming in C", "CS", "1:30pm - 2:45pm", Day.Tu);
	private Course cs166 = new Course("CS166", "Information Security", "CS", "4:30pm - 5:45pm", Day.Tu);
	private Course cs151 = new Course("CS151", "Object-Oriented Design", "CS", "6:00pm - 7:15pm", Day.Tu);
	
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
	
	public void printInfo()
	{
		System.out.println("Name: " + getFirstName() + " " + getLastName() + " \n"
						 + "Age: " + getAge() + " \n"
					 	 + "GPA: " + getGpa() + " \n"
						 + "Major: " + getMajor() + " \n"
						 + "Department: " + getDepartment() + " \n"
						 + "Classes:\t" + cs185c.getCourseName() + ": " + cs185c.getCourseDesc() + " \n"
						 + "\t\t" + cs49c.getCourseName() + ": " + cs49c.getCourseDesc() + " \n"
						 + "\t\t" + cs166.getCourseName() + ": " + cs166.getCourseDesc() + " \n"
						 + "\t\t" + cs151.getCourseName() + ": " + cs151.getCourseDesc() + " \n");
	}
}
