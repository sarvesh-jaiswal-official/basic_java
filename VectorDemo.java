import java.io.*;
import java.util.*;

class VectorDemo
{
	public static void main(String args[]) throws IOException
	{	
		Vector list = new Vector();
		
		list.addElement(new Integer(10));
		list.addElement(new Float(20.22));
		list.addElement(new String("Sarvesh"));
		
		int s = list.size();
		
		for(int i=0; i<s; i++)
		{
			System.out.println(list.elementAt(i));
		}
	}
}