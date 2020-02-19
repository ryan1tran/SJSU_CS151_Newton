package hw3;

public class HourlyEmployee extends Employee
{
	public HourlyEmployee()
	{
		super();
	}
	
	public HourlyEmployee(String firstName, String lastName)
	{
		super(firstName, lastName);
	}
	
	public HourlyEmployee(String firstName, String lastName, Address address)
	{
		super(firstName, lastName, address);
	}
	
	public HourlyEmployee(String firstName, String lastName, int age, int socialSecurity, Address address, String gender, float weight, String education, int id, boolean accommodations, String status, String startDate, float pay, boolean directDeposit)
	{
		super(firstName, lastName, age, socialSecurity, address, gender, weight, education, id, accommodations, status, startDate, pay, directDeposit);
	}
	
	public float computePay(float work)
	{
		return work * getPay();
	}
}
