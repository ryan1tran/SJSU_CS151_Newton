package hw1;

public class Employee extends Person
{
	private int employeeID;
	private String employeeStatus;
	private String startDate;
	private float hourlyPay;
	private float yearlySalary;
	
	public Employee()
	{
		super();
		this.employeeID = -1;;
		this.employeeStatus = null;
		this.startDate = null;
		this.hourlyPay = -1;
		this.yearlySalary = -1;
		
	}

	public Employee(String firstName, String lastName, int age, int socialSecurity, String address, String gender, float weight, int employeeID, String employeeStatus, String startDate, float hourlyPay, float yearlySalary)
	{
		super(firstName, lastName, age, socialSecurity, address, gender, weight);
		this.employeeID = employeeID;
		this.employeeStatus = employeeStatus;
		this.startDate = startDate;
		this.hourlyPay = hourlyPay;
		this.yearlySalary = yearlySalary;
	}
	
	public void calculatePay(int work)
	{
		if(employeeStatus.equals("contractor") || employeeStatus.equals("part time"))
			System.out.print(hourlyPay * work);
		else
			System.out.print(yearlySalary / 52 * work);
	}
	
	@Override
	public void introduce()
	{
		super.introduce();
		System.out.println("My employee ID is " + employeeID + " and I am a " + employeeStatus + " worker.");
	}

	public int getEmployeeID()
	{
		return employeeID;
	}

	public void setEmployeeID(int employeeID)
	{
		this.employeeID = employeeID;
	}

	public String getEmployeeStatus()
	{
		return employeeStatus;
	}

	public void setEmployeeStatus(String employeeStatus)
	{
		this.employeeStatus = employeeStatus;
	}

	public String getStartDate()
	{
		return startDate;
	}

	public void setStartDate(String startDate)
	{
		this.startDate = startDate;
	}

	public float getHourlyPay()
	{
		return hourlyPay;
	}

	public void setHourlyPay(float hourlyPay)
	{
		this.hourlyPay = hourlyPay;
	}

	public float getYearlySalary()
	{
		return yearlySalary;
	}

	public void setYearlySalary(float yearlySalary)
	{
		this.yearlySalary = yearlySalary;
	}
}
