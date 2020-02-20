import java.util.*;
import java.io.*;

class VectorInt
{
	public static void main(String args[]) throws IOException
	{
		Vector list = new Vector();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, num;
		System.out.println("Enter the Vector size: ");
		n = Integer.parseInt(br.readLine());
		System.out.println("Enter the elements: ");
		for(int i=0; i<n; i++)
		{
			num = Integer.parseInt(br.readLine());
			list.addElement(num);
		}
		
		System.out.println("Elements in Vector: ");
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.elementAt(i));
		}
		
		list.removeElementAt(0);
		System.out.println("Elements in Vector after Remove element at [0]: ");
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.elementAt(i));
		}
	}
}
		