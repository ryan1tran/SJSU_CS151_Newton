package hw5;

public class StudentTest
{
	public static void main(String[] args)
	{
		Student johnSmith1 = new Student("John", "Smith", 20, 3.6f, "Computer Science", "School of Computer Science");
		Student johnSmith2 = new Student("John", "Smith", 20, 3.6f, "Computer Science", "School of Computer Science");
		
		johnSmith1.printInfo();
		System.out.println("------------------------------------------------------\n");
		johnSmith2.printInfo();
	}
}
