package hw5;

public class Employee
{
	String firstName;
	String lastName;
	int employeeId;
	float hourlyPay;
	
	public Employee(String firstName, String lastName, int employeeId, float hourlyPay)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.hourlyPay = hourlyPay;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public int getEmployeeId()
	{
		return employeeId;
	}
	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}
	public float getHourlyPay()
	{
		return hourlyPay;
	}
	public void setHourlyPay(float hourlyPay)
	{
		this.hourlyPay = hourlyPay;
	}
	
	public float computePay(int hoursWorked) throws Exception
	{
		if (hoursWorked < 0)
			throw new NumberFormatException("Invalid input value: " + hoursWorked + " hours.");
		else if (hoursWorked > 40)
			throw new TooManyHoursWorkedException("Too many hours worked: " + (hoursWorked - 40) + " hours over the limit (of 40).");
		else
			return hourlyPay * hoursWorked;
	}
}
