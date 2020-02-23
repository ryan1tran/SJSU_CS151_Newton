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
	
	@Override
	public String toString()
	{
		return getFirstName() + " " + getLastName() + "\n"
				+ "Status: " + getStatus() + "\n"
				+ "Age: " + getAge() + "\n"
				+ "Address:\n" + address.toString() + "\n"
				+ "Gender: " + getGender() + "\n"
				+ "Weight: " + getWeight() + "\n"
				+ "Education: " + getEducation() + "\n"
				+ "ID: " + getId() + "\n"
				+ "Needs Accommodations: " + needsAccommodations() + "\n"
				+ "Status: " + getStatus() + "\n"
				+ "Start Date: " + getStartDate() + "\n"
				+ "Has Direct Deposit: " +  hasDirectDeposit() + "\n";
	}
	
	@Override
	public void introduce()
	{
		System.out.println(toString());
	}
	
	public void introduceSS()
	{
		introduce();
		System.out.println("Social Security: " + getSocialSecurity() + "\n");
	}
	
	public void introduceSSpay()
	{
		introduceSS();
		System.out.println("Pay: $" + getPay() + "\n");
	}
}
