package hw3;

public class PartTimeHourlyEmployee extends HourlyEmployee
{
	public PartTimeHourlyEmployee()
	{
		super();
	}
	
	public PartTimeHourlyEmployee(String firstName, String lastName)
	{
		super(firstName, lastName);
	}
	
	public PartTimeHourlyEmployee(String firstName, String lastName, Address address)
	{
		super(firstName, lastName, address);
	}
	
	public PartTimeHourlyEmployee(String firstName, String lastName, int age, int socialSecurity, Address address, String gender, float weight, String education, int id, boolean accommodations, String status, String startDate, float pay, boolean directDeposit)
	{
		super(firstName, lastName, age, socialSecurity, address, gender, weight, education, id, accommodations, status, startDate, pay, directDeposit);
	}
	
	@Override
	public float computePay(float work)
	{
		if (work > 40)
			return -1;
		else
			return work * getPay();
	}
	
	public void introduceSSpay()
	{
		introduceSS();
		System.out.println("Pay: $" + getPay() + " per hour\n");
	}
}
