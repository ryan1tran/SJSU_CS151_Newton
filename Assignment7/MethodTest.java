package hw;

import java.util.*;

public class MethodTest
{
	public static <T> void count(List<T> list)
	{
		System.out.println("This list is size: " + list.size());
	}
	
	public static void main(String[] args)
	{
		ArrayList<String> stringList = new ArrayList<>();
		ArrayList<Integer> intList = new ArrayList<>();
		ArrayList<Double> doubleList = new ArrayList<>();
		
		stringList.add(new String("CS"));
		stringList.add(new String("1"));
		stringList.add(new String("5"));
		stringList.add(new String("1"));
		stringList.add(new String("Newton"));
		
		for (int i = 1; i <= 6; i++)
			intList.add(new Integer(i));
		
		for (int i = 1; i <= 8; i++)
			doubleList.add(new Double(i));
		
		count(stringList);
		count(intList);
		count(doubleList);
	}
}
