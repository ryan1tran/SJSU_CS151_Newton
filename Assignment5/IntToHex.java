package hw5;

import java.util.*;

public class IntToHex
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input a decimal value to covert to hexadecimal: ");
		Integer input = new Integer(scan.nextInt());
		scan.close();
		
		System.out.println(input + " is " + Integer.toHexString(input) + " in hex.");
	}
}
