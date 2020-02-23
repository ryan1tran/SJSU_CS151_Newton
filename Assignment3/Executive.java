package hw3;

public class Executive extends SalaryEmployee
{
	float yearlyBonus;
	
	public Executive()
	{
		super();
	}
	
	public Executive(String firstName, String lastName)
	{
		super(firstName, lastName);
	}
	
	public Executive(String firstName, String lastName, Address address)
	{
		super(firstName, lastName, address);
	}
	
	public Executive(String firstName, String lastName, int age, int socialSecurity, Address address, String gender, float weight, String education, int id, boolean accommodations, String status, String startDate, float pay, boolean directDeposit, float yearlyBonus)
	{
		super(firstName, lastName, age, socialSecurity, address, gender, weight, education, id, accommodations, status, startDate, pay, directDeposit);
		this.yearlyBonus = yearlyBonus;
	}
	
	public float getYearlyBonus()
	{
		return yearlyBonus;
	}

	public void setYearlyBonus(float yearlyBonus)
	{
		this.yearlyBonus = yearlyBonus;
	}

	public float computePay()
	{
		return getPay() + getYearlyBonus();
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
		System.out.println("Pay: $" + getPay() + " annually\n"
				+ "Yearly Bonus: $" + getYearlyBonus() + "\n");
	}
}
