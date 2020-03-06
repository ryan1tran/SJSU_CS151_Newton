package hw6;

import java.util.*;

public class ListManipulator
{
	public ArrayList<Integer> sort(ArrayList<Integer> myLst, boolean ascending)
	{
		ArrayList<Integer> sorted = myLst;
		
		if (ascending)
		{
			Collections.sort(sorted);
			return sorted;
		}else
		{
			Collections.sort(sorted, Collections.reverseOrder());
			return sorted;
		}
	}
	
	public ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst)
	{
		ArrayList<Integer> sorted = sort(myLst, true);
		
		int first = sorted.get(0);
		int last = sorted.get(sorted.size());
		
		sorted.set(0, last);
		sorted.set(sorted.size(), first);
		
		return sorted;
	}
	
	public void table(ArrayList<Integer> myLst)
	{
		ArrayList<Integer> sorted = myLst;
		sort(sorted, true);
		
		HashMap<Integer, Integer> numOccurrences = new HashMap<>();
		
		for (int i = 0; i < myLst.size(); i++)
		{
			if(!numOccurrences.containsKey(sorted.get(i)))
				numOccurrences.put(sorted.get(i), 1);
			else
				numOccurrences.put(sorted.get(i), numOccurrences.get(sorted.get(i)) + 1);
		}
        
        for (Map.Entry<Integer, Integer> entry : numOccurrences.entrySet())
        {
        	System.out.println("Number: " + entry.getKey() + "\tOccurrences: " + entry.getValue());
        }
	}
	
	public static void main(String[] args)
	{
		//Tester
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(26);
		list.add(7);
		list.add(7);
		
		ListManipulator lm = new ListManipulator();
		lm.table(list);
	}
}
