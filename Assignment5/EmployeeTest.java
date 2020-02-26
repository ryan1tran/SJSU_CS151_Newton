package hw5;

public class EmployeeTest
{
	public static void main(String[] args)
	{
		Employee johnSmith = new Employee("John", "Smith", 101, 35);
		
		System.out.print("40 hours worked: ");
		try
		{
			System.out.println("$" + johnSmith.computePay(40) + "\n");
		}catch (Exception e)
		{
			System.out.println(e.getMessage() + "\n");
		}
		
		System.out.print("23 hours worked: ");
		try
		{
			System.out.println("$" + johnSmith.computePay(23) + "\n");
		}catch (Exception e)
		{
			System.out.println(e.getMessage() + "\n");
		}
		
		System.out.print("1 hour worked: ");
		try
		{
			System.out.println("$" + johnSmith.computePay(1) + "\n");
		}catch (Exception e)
		{
			System.out.println(e.getMessage() + "\n");
		}
		
		System.out.print("0 hours worked: ");
		try
		{
			System.out.println("$" + johnSmith.computePay(0) + "\n");
		}catch (Exception e)
		{
			System.out.println(e.getMessage() + "\n");
		}
		
		System.out.print("-5 hours worked: ");
		try
		{
			System.out.println("$" + johnSmith.computePay(-5) + "\n");
		}catch (Exception e)
		{
			System.out.println(e.getMessage() + "\n");
		}
		
		System.out.print("45 hours worked: ");
		try
		{
			System.out.println("$" + johnSmith.computePay(45) + "\n");
		}catch (Exception e)
		{
			System.out.println(e.getMessage() + "\n");
		}
	}
}
