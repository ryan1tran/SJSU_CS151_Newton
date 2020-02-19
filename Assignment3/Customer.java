package hw3;

public class Customer extends Person
{
	String paymentMethod;
	
	public Customer()
	{
		super();
	}
	
	public Customer(String firstName, String lastName)
	{
		super(firstName, lastName);
	}
	
	public Customer(String firstName, String lastName, Address address)
	{
		super(firstName, lastName, address);
	}
	
	public Customer(String firstName, String lastName, int age, int socialSecurity, Address address, String gender, float weight, String education, int id, boolean accommodations, String status, String paymentMethod)
	{
		super(firstName, lastName, age, socialSecurity, address, gender, weight, education, id, accommodations, status);
		this.paymentMethod = paymentMethod;
	}
	
	public String getPaymentMethod()
	{
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod)
	{
		this.paymentMethod = paymentMethod;
	}

	public void makePayment()
	{
		System.out.println("Payment method: " + getPaymentMethod());
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
				+ "Status: " + getStatus() + "\n";
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
		makePayment();
	}
}
