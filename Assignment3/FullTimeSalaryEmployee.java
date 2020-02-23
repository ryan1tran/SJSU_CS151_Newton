package hw3;

public class FullTimeSalaryEmployee extends SalaryEmployee
{	
	public FullTimeSalaryEmployee()
	{
		super();
	}
	
	public FullTimeSalaryEmployee(String firstName, String lastName)
	{
		super(firstName, lastName);
	}
	
	public FullTimeSalaryEmployee(String firstName, String lastName, Address address)
	{
		super(firstName, lastName, address);
	}
	
	public FullTimeSalaryEmployee(String firstName, String lastName, int age, int socialSecurity, Address address, String gender, float weight, String education, int id, boolean accommodations, String status, String startDate, float pay, boolean directDeposit)
	{
		super(firstName, lastName, age, socialSecurity, address, gender, weight, education, id, accommodations, status, startDate, pay, directDeposit);
	}

	public float computePay(float work)
	{
		return getPay() / 52 * work;
	}
	
	public void introduceSSpay()
	{
		introduceSS();
		System.out.println("Pay: $" + getPay() + " annually\n");
	}
}
