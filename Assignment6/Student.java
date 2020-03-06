package hw6;

import java.util.*;

public class Student
{
	private String firstName;
	private String lastName;
	private int age;
	private float gpa;
	private String major;
	private String department;
	private LinkedList<Course> courses;
	
	public Student()
	{
		this.firstName = null;
		this.lastName = null;
		this.age = -1;
		this.gpa = -1;
		this.major = null;
		this.department = null;
		courses = new LinkedList<>();
	}
	
	public Student(String firstName, String lastName, int age, float gpa, String major, String department)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
		courses = new LinkedList<>();
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

	public LinkedList<Course> getCourses()
	{
		return courses;
	}

	public void setCourses(LinkedList<Course> courses)
	{
		this.courses = courses;
	}
	
	public void addCourse(Course toAdd)
	{
		courses.add(toAdd);
	}
	
	public void removeCourse(Course toRemove)
	{
		courses.remove(toRemove);
	}
	
	public void sortCourses(boolean ascending, String sortAttribute)
	{
		if (ascending)
		{
			if (sortAttribute.equals("courseName"))
			{
				Collections.sort(courses, new Comparator<Course>()
				{
					public int compare(Course c1, Course c2)
					{
						return c1.getCourseName().compareTo(c2.getCourseName());
					}
				});
			}else if (sortAttribute.equals("courseDesc"))
			{
				Collections.sort(courses, new Comparator<Course>()
				{
					public int compare(Course c1, Course c2)
					{
						return c1.getCourseDesc().compareTo(c2.getCourseDesc());
					}
				});
			}else if (sortAttribute.equals("department"))
			{
				Collections.sort(courses, new Comparator<Course>()
				{
					public int compare(Course c1, Course c2)
					{
						return c1.getDepartment().compareTo(c2.getDepartment());
					}
				});
			}else if (sortAttribute.equals("time"))
			{
				Collections.sort(courses, new Comparator<Course>()
				{
					public int compare(Course c1, Course c2)
					{
						return c1.getTime().compareTo(c2.getTime());
					}
				});
			}else if (sortAttribute.equals("classDay"))
			{
				Collections.sort(courses, new Comparator<Course>()
				{
					public int compare(Course c1, Course c2)
					{
						return c1.getClassDay().compareTo(c2.getClassDay());
					}
				});
			}else
				System.out.println("Invalid sorting attribute: " + sortAttribute);
		}else
		{
			if (sortAttribute.equals("courseName"))
			{
				Collections.sort(courses, new Comparator<Course>()
				{
					public int compare(Course c1, Course c2)
					{
						return c2.getCourseName().compareTo(c1.getCourseName());
					}
				});
			}else if (sortAttribute.equals("courseDesc"))
			{
				Collections.sort(courses, new Comparator<Course>()
				{
					public int compare(Course c1, Course c2)
					{
						return c2.getCourseDesc().compareTo(c1.getCourseDesc());
					}
				});
			}else if (sortAttribute.equals("department"))
			{
				Collections.sort(courses, new Comparator<Course>()
				{
					public int compare(Course c1, Course c2)
					{
						return c2.getDepartment().compareTo(c1.getDepartment());
					}
				});
			}else if (sortAttribute.equals("time"))
			{
				Collections.sort(courses, new Comparator<Course>()
				{
					public int compare(Course c1, Course c2)
					{
						return c2.getTime().compareTo(c1.getTime());
					}
				});
			}else if (sortAttribute.equals("classDay"))
			{
				Collections.sort(courses, new Comparator<Course>()
				{
					public int compare(Course c1, Course c2)
					{
						return c2.getClassDay().compareTo(c1.getClassDay());
					}
				});
			}else
				System.out.println("Invalid sorting attribute: " + sortAttribute);
		}
	}
	
	public static void main(String[] args)
	{
		// Tester
		Student s = new Student("Ryan", "Tran", 19, 3.8f, "Computer Science", "College of Science");
		
		s.addCourse(new Course("CS185C", "Advanced Practical Computing Topics", "CS", "12:00pm - 1:15pm", Day.M));
		s.addCourse(new Course("CS49C", "Programming in C", "SE", "1:30pm - 2:45pm", Day.Tu));
		s.addCourse(new Course("CS166", "Information Security", "CS", "4:30pm - 5:45pm", Day.W));
		s.addCourse(new Course("CS151", "Object-Oriented Design", "EE", "6:00pm - 7:15pm", Day.Th));
		
		System.out.println("Ascending course name:\n");
		s.sortCourses(true, "courseName");
		for (Course c : s.getCourses())
			System.out.println(c.getCourseName());
		System.out.println("-----------------------------------------\n");
		System.out.println("Descending course name:\n");
		s.sortCourses(false, "courseName");
		for (Course c : s.getCourses())
			System.out.println(c.getCourseName());
		System.out.println("-----------------------------------------\n");
		System.out.println("Ascending course description:\n");
		s.sortCourses(true, "courseDesc");
		for (Course c : s.getCourses())
			System.out.println(c.getCourseDesc());
		System.out.println("-----------------------------------------\n");
		System.out.println("Descending course description:\n");
		s.sortCourses(false, "courseDesc");
		for (Course c : s.getCourses())
			System.out.println(c.getCourseDesc());
		System.out.println("-----------------------------------------\n");
		System.out.println("Ascending course department:\n");
		s.sortCourses(true, "department");
		for (Course c : s.getCourses())
			System.out.println(c.getDepartment());
		System.out.println("-----------------------------------------\n");
		System.out.println("Descending course department:\n");
		s.sortCourses(false, "department");
		for (Course c : s.getCourses())
			System.out.println(c.getDepartment());
		System.out.println("-----------------------------------------\n");
		System.out.println("Ascending time:\n");
		s.sortCourses(true, "time");
		for (Course c : s.getCourses())
			System.out.println(c.getTime());
		System.out.println("-----------------------------------------\n");
		System.out.println("Descending time:\n");
		s.sortCourses(false, "courseDesc");
		for (Course c : s.getCourses())
			System.out.println(c.getTime());
		System.out.println("-----------------------------------------\n");
		System.out.println("Ascending class day:\n");
		s.sortCourses(true, "classDay");
		for (Course c : s.getCourses())
			System.out.println(c.getClassDay());
		System.out.println("-----------------------------------------\n");
		System.out.println("Descending class day:\n");
		s.sortCourses(false, "classDay");
		for (Course c : s.getCourses())
			System.out.println(c.getClassDay());
		System.out.println("-----------------------------------------\n");
		System.out.println("Ascending by invalid attribute:\n");
		s.sortCourses(true, "invalidInput");
		System.out.println("-----------------------------------------\n");
		System.out.println("Descending invalid attribute:\n");
		s.sortCourses(false, "invalidInput");
		System.out.println("-----------------------------------------\n");
	}
}
