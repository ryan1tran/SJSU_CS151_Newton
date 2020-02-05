package hw1;

public class StudentTest
{
	public static void main(String[] args)
	{
		Student johnSmith = new Student("John", "Smith", 20, 3.6f, "Computer Science", "School of Computer Science");
		Student.Course johns = johnSmith.new Course();
		johns.printSchedule();
	}
}
