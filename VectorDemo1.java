import java.util.*;
import java.io.*;

class VectorDemo1
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Vector list = new Vector();
		
		list.addElement(new Integer(10));
		list.addElement(new Integer(20));
		list.addElement(new Float(40.5));
		list.addElement(new Float(80.4));
		list.addElement(new Character('A'));
		list.addElement(new Character('B'));
		list.addElement(new String("Java"));
		list.addElement(new String("OOP"));
		
		System.out.println("Enter the element you want to find: ");
		int c = Integer.parseInt(br.readLine());
		if(list.contains(c))
		{
			System.out.println("Element is present");
		}
		else
		{
				System.out.println("Element is not  present");
		}
		
		int size = list.size();
		
		for(int i=0; i<size; i++)
		{
			System.out.println("Element '"+list.elementAt(i)+"' is present at position "+i+" in the vector");
		}
		
		list.clear();
		int size1 = list.size();
		
		if(size1>0)
		{	
			for(int i=0; i<size1; i++)
			{
				System.out.println(list.elementAt(i));
			}
		}
		else
		{
			System.out.println("Vector is empty");
		}
	}
}