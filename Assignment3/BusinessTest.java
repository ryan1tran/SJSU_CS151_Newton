package hw3;

public class BusinessTest
{
	public static void main(String[] args)
	{
		Executive e1 = new Executive("Exec", "One", 30, 123456789, new Address(1234, "That Street", "San Jose", 95132, "CA"), "male", 100, "university", 1, true, "executive", "2/18/2020", 150000, true, 20000);
		Executive e2 = new Executive("Exec", "Two", 30, 987654321, new Address(4321, "This Street", "San Jose", 95131, "CA"), "female", 100, "high school", 2, true, "executive", "2/18/2020", 170000, false, 25000);
		FullTimeSalaryEmployee fs1 = new FullTimeSalaryEmployee("Ftse", "One", 25, 123987456, new Address(2345, "A Street", "San Jose", 95192, "CA"), "female", 100, "community college", 3, false, "full time salaried employee", "2/18/2020", 110000, false);
		FullTimeSalaryEmployee fs2 = new FullTimeSalaryEmployee("Ftse", "Two", 25, 123987654, new Address(5432, "That Street", "San Jose", 95132, "CA"), "male", 100, "university", 4, false, "full time salaried employee", "2/18/2020", 125000, false);
		FullTimeHourlyEmployee fh1 = new FullTimeHourlyEmployee("Fthe", "One", 23, 987123456, new Address(3456, "This Street", "San Jose", 95131, "CA"), "male", 100, "university", 5, true, "full time hourly employee", "2/18/2020", 50, true, 25);
		FullTimeHourlyEmployee fh2 = new FullTimeHourlyEmployee("Fthe", "Two", 23, 987123654, new Address(6543, "A Street", "San Jose", 95192, "CA"), "female", 100, "high school", 6, true, "full time hourly employee", "2/18/2020", 55, false, 27.5f);
		PartTimeHourlyEmployee ph1 = new PartTimeHourlyEmployee("Pthe", "One", 20, 321789456, new Address(4567, "That Street", "San Jose", 95132, "CA"), "female", 100, "community college", 7, false, "part time hourly employee", "2/18/2020", 35, true);
		PartTimeHourlyEmployee ph2 = new PartTimeHourlyEmployee("Pthe", "Two", 20, 321789654, new Address(7654, "This Street", "San Jose", 95131, "CA"), "male", 100, "community college", 8, false, "part time hourly employee", "2/18/2020", 40, true);
		Contractor co1 = new Contractor("Co", "One", 25, 123789456, new Address(5678, "A Street", "San Jose", 95192, "CA"), "male", 100, "community college", 9, true, "contractor", "2/18/2020", 50, true, 23);
		Contractor co2 = new Contractor("Co", "Two", 25, 123789654, new Address(8765, "That Street", "San Jose", 95132, "CA"), "female", 100, "university", 10, true, "contractor", "2/18/2020", 45, false, 20);
		Customer cu1 = new Customer("Cu", "One", 10, 321987456, new Address(6789, "This Street", "San Jose", 95131, "CA"), "female", 100, "elementary school", 1, false, "customer", "Mastercard");
		Customer cu2 = new Customer("Cu", "Two", 20, 321987654, new Address(9876, "A Street", "San Jose", 95192, "CA"), "male", 100, "university", 2, false, "customer", "PayPal");
		
		e1.introduce();
		System.out.println("Pay: $" + e1.computePay() + "\n" + "-----------------------------------" + "\n");
		
		e2.introduce();
		System.out.println("Pay: $" + e2.computePay() + "\n" + "-----------------------------------" + "\n");
		
		fs1.introduce();
		System.out.println("Pay: $" + fs1.computePay(50) + "\n" + "-----------------------------------" + "\n");
		
		fs2.introduce();
		System.out.println("Pay: $" + fs2.computePay(50) + "\n" + "-----------------------------------" + "\n");
		
		fh1.introduce();
		System.out.println("Pay: $" + fh1.computePay(40) + "\n" + "-----------------------------------" + "\n");
		
		fh2.introduce();
		System.out.println("Pay: $" + fh2.computePay(45) + "\n" + "-----------------------------------" + "\n");
		
		ph1.introduce();
		System.out.println("Pay: $" + ph1.computePay(40) + "\n" + "-----------------------------------" + "\n");
		
		ph2.introduce();
		System.out.println("Pay: $" + ph2.computePay(41) + "\n" + "-----------------------------------" + "\n");
		
		co1.introduce();
		System.out.println("Pay: $" + co1.computePay(45) + "\n" + "-----------------------------------" + "\n");
		
		co2.introduce();
		System.out.println("Pay: $" + co2.computePay(35) + "\n" + "-----------------------------------" + "\n");
		
		cu1.introduce();
		cu1.makePayment();
		System.out.println("-----------------------------------" + "\n");
		
		cu2.introduce();
		cu2.makePayment();
		System.out.println("-----------------------------------" + "\n");
	}
}
