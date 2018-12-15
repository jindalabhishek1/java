// See ScannerDemo.java for Scanner vs BufferedReader.
// Code using Buffer Class
import java.io.*;
class BufferedReaderDemo
{
	public static void main(String args[])
				throws IOException
	{
		BufferedReader br = new BufferedReader(new
		InputStreamReader(System.in));
		System.out.println("Enter an integer");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter a String");
		String b = br.readLine();
		System.out.printf("You have entered:- " + a +
						" and name as " + b + "\n");
	}
}
