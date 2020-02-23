package hw3;

public class FullTimeHourlyEmployee extends HourlyEmployee
{
	float overtimePay;
	
	public FullTimeHourlyEmployee()
	{
		super();
		this.overtimePay = -1;
	}
	
	public FullTimeHourlyEmployee(String firstName, String lastName)
	{
		super(firstName, lastName);
		this.overtimePay = -1;
	}
	
	public FullTimeHourlyEmployee(String firstName, String lastName, Address address)
	{
		super(firstName, lastName, address);
		this.overtimePay = -1;
	}
	
	public FullTimeHourlyEmployee(String firstName, String lastName, int age, int socialSecurity, Address address, String gender, float weight, String education, int id, boolean accommodations, String status, String startDate, float pay, boolean directDeposit, float overtimePay)
	{
		super(firstName, lastName, age, socialSecurity, address, gender, weight, education, id, accommodations, status, startDate, pay, directDeposit);
		this.overtimePay = overtimePay;
	}
	
	public float getOvertimePay()
	{
		return overtimePay;
	}

	public void setOvertimePay(float overtimePay)
	{
		this.overtimePay = overtimePay;
	}

	@Override
	public float computePay(float work)
	{
		if (work > 40)
			return (getPay() * 40) + (getOvertimePay() * (work - 40));
		else
			return work * getPay();
	}
	
	public void introduceSSpay()
	{
		introduceSS();
		System.out.println("Pay: $" + getPay() + " per hour\n"
				+ "Overtime Pay: $" + getOvertimePay() + " per overtime hour\n");
	}
}
