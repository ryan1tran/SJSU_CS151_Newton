package hw6;

public class Course
{
	String courseName;
	String courseDesc;
	String department;
	String time;
	Day classDay;
	
	public Course(String courseName, String courseDesc, String department, String time, Day classDay)
	{
		this.courseName = courseName;
		this.courseDesc = courseDesc;
		this.department = department;
		this.time = time;
		this.classDay = classDay;
	}

	public String getCourseName()
	{
		return courseName;
	}

	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}

	public String getCourseDesc()
	{
		return courseDesc;
	}

	public void setCourseDesc(String courseDesc)
	{
		this.courseDesc = courseDesc;
	}

	public String getDepartment()
	{
		return department;
	}

	public void setDepartment(String department)
	{
		this.department = department;
	}

	public String getTime()
	{
		return time;
	}

	public void setTime(String time)
	{
		this.time = time;
	}

	public Day getClassDay()
	{
		return classDay;
	}

	public void setClassDay(Day day)
	{
		this.classDay = day;
	}
}
