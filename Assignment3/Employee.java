package hw3;

public class Employee extends Person
{
	private String startDate;
	private float pay;
	private boolean directDeposit;

	public Employee()
	{
		super();
		this.startDate = null;
		this.pay = -1;
		this.directDeposit = false;
	}
	
	public Employee(String firstName, String lastName)
	{
		super(firstName, lastName);
		this.startDate = null;
		this.pay = -1;
		this.directDeposit = false;
	}
	
	public Employee(String firstName, String lastName, Address address)
	{
		super(firstName, lastName, address);
		this.startDate = null;
		this.pay = -1;
		this.directDeposit = false;
	}
	
	public Employee(String firstName, String lastName, int age, int socialSecurity, Address address, String gender, float weight, String education, int id, boolean accommodations,  String status, String startDate, float pay, boolean directDeposit)
	{
		super(firstName, lastName, age, socialSecurity, address, gender, weight, education, id, accommodations, status);
		this.startDate = startDate;
		this.pay = pay;
		this.directDeposit = directDeposit;
	}
	
	@Override
	public void introduce()
	{
		super.introduce();
		System.out.println("My employee ID is " + getId() + " and I am a " + getStatus() + " worker.");
	}

	public String getStartDate()
	{
		return startDate;
	}

	public void setStartDate(String startDate)
	{
		this.startDate = startDate;
	}

	public float getPay()
	{
		return pay;
	}

	public void setPay(float pay)
	{
		this.pay = pay;
	}

	public boolean hasDirectDeposit()
	{
		return directDeposit;
	}

	public void setDirectDeposit(boolean directDeposit)
	{
		this.directDeposit = directDeposit;
	}
}
