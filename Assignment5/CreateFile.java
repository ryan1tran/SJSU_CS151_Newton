package hw5;

import java.util.*;
import java.io.*;

public class CreateFile
{
	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input as many lines as you'd like. To end, please input \"@q\".");
		
		StringBuilder reader = new StringBuilder();
		String nextLine = scan.nextLine();
		
		while(!nextLine.equals("@q"))
		{
			reader.append(nextLine + "\n");
			nextLine = scan.nextLine();
		}
		scan.close();
		
		String input = reader.toString();
		String directory = "C:\\Users\\Ryan Tran\\workspace\\151hw5\\"; // change this directory accordingly
		File output = new File(directory + "command_line_input.txt");
	    BufferedWriter writer = new BufferedWriter(new FileWriter(output));
	    writer.write(input);
	    writer.close();
	}
}
