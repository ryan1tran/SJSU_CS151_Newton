package hw3;

public class Address
{
	int streetNum;
	String streetName;
	String cityName;
	int zipCode;
	String state;
	
	public Address(int streetNum, String streetName, String cityName, int zipCode, String state)
	{
		super();
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.cityName = cityName;
		this.zipCode = zipCode;
		this.state = state;
	}
	
	public int getStreetNum()
	{
		return streetNum;
	}

	public void setStreetNum(int streetNum)
	{
		this.streetNum = streetNum;
	}

	public String getStreetName()
	{
		return streetName;
	}

	public void setStreetName(String streetName)
	{
		this.streetName = streetName;
	}

	public String getCityName()
	{
		return cityName;
	}

	public void setCityName(String cityName)
	{
		this.cityName = cityName;
	}

	public int getZipCode()
	{
		return zipCode;
	}

	public void setZipCode(int zipCode)
	{
		this.zipCode = zipCode;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String toString()
	{
		return getStreetNum() + " " + getStreetName() + "\n" + getCityName() + " " + getZipCode() + " " + getState();
	}
}
