package hw5;

import java.io.*;

public class ReadFileInput
{
	public static void main(String[] args) throws IOException
	{
		String directory = "C:\\Users\\Ryan Tran\\workspace\\151hw5\\"; // change this directory accordingly
		File input = new File(directory + "quote.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(input));
		StringBuilder reader = new StringBuilder();
		String nextLine = br.readLine();
		
		while(nextLine != null)
		{
			reader.append(nextLine + "\n");
			nextLine = br.readLine();
		}
		
		br.close();
		
		String output = reader.toString();
		System.out.println(output);
	}
}
