import java.io.*;
import java.util.*;

class VectorArrayDemo
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Vector list = new Vector(5);
		String n;
		
		System.out.println("Enter the five element for Vector: ");
		
		for(int i=0; i<5; i++)
		{
			n = br.readLine();
			list.addElement(n);
		}
		
		int s = list.size();
		
		System.out.println("\nFive elements are: ");
		
		for(int i=0; i<s; i++)
		{
			System.out.println(list.elementAt(i));
		}
	}
}