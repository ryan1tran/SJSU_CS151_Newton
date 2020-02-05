package hw1;

public class EmployeeTest
{
	public static void main(String[] args)
	{
		Employee joeSmith = new Employee("Joe", "Smith", 30, 123456789, "123 Place", "male", 150, 001, "contractor", "1/1/2020", 60, -1);
		Employee lisaGray = new Employee("Lisa", "Gray", 28, 987654321, "321 Road", "female", 110, 002, "full time", "1/2/2020", -1, 110000);
		Employee timothyBriggs = new Employee("Timothy", "Briggs", 25, 192837465, "132 Court", "female", 200, 003, "full time", "1/3/2020", -1, 80000);
		Employee georgeWallace = new Employee("George", "Wallace", 20, 918273645, "231 Lane", "male", 170, 004, "part time", "1/4/2020", 20, -1);
		Employee amyStudent = new Employee("Amy", "Student", 24, 546372819, "132 Circle", "female", 150, 005, "contractor", "1/5/2020", 45, -1);
		
		joeSmith.introduce();
		System.out.print("$");
		joeSmith.calculatePay(30);
		System.out.println(" earned!\n");
		
		lisaGray.introduce();
		System.out.print("$");
		lisaGray.calculatePay(2);
		System.out.println(" earned!\n");
		
		timothyBriggs.introduce();
		System.out.print("$");
		timothyBriggs.calculatePay(4);
		System.out.println(" earned!\n");
		
		georgeWallace.introduce();
		System.out.print("$");
		georgeWallace.calculatePay(25);
		System.out.println(" earned!\n");
		
		amyStudent.introduce();
		System.out.print("$");
		amyStudent.calculatePay(45);
		System.out.println(" earned!\n");
	}
}
