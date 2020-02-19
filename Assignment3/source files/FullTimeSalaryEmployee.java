package hw3;

public class FullTimeSalaryEmployee extends Employee
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
				+ "Pay: " + getPay() + "\n"
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
}
