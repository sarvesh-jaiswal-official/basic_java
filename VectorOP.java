import java.util.*;
import java.io.*;

class VectorOP
{
	public static void main(String args[]) throws IOException
	{
		Vector list = new Vector();
	
		for(int i=0; i<args.length; i++)
		{
			list.addElement(args[i]);
		}
			
		System.out.println("Vector elements are: ");
		
		for(int k=0; k<list.size(); k++)
		{
			System.out.println(list.elementAt(k));
		}
	
		list.insertElementAt("Corel",2);
		String newlist[] = new String[list.size()];
		list.copyInto(newlist);
		System.out.println("\nThe new Array elements are: ");
		
		for(int z=0; z<newlist.length; z++)
		{
			System.out.println(newlist[z]);
		}
	}
}