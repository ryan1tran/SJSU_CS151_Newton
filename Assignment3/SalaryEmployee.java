package hw3;

public class SalaryEmployee extends Employee
{
	public SalaryEmployee()
	{
		super();
	}
	
	public SalaryEmployee(String firstName, String lastName)
	{
		super(firstName, lastName);
	}
	
	public SalaryEmployee(String firstName, String lastName, Address address)
	{
		super(firstName, lastName, address);
	}
	
	public SalaryEmployee(String firstName, String lastName, int age, int socialSecurity, Address address, String gender, float weight, String education, int id, boolean accommodations, String status, String startDate, float pay, boolean directDeposit)
	{
		super(firstName, lastName, age, socialSecurity, address, gender, weight, education, id, accommodations, status, startDate, pay, directDeposit);
	}
}
