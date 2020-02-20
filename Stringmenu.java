import java.lang.*;
import java.io.*;

class Stringmenu
{
	public static void main(String args[]) throws IOException
	{
		String str, str1, c;
		int ch, i;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nMenu=>\n1.To search a word inside a string.\n2.To search last position of substring.\n3.To compare two string.\n4.To print reverse of string.");
		System.out.println("\nEnter the choice: ");
		ch = Integer.parseInt(br.readLine());
		switch(ch)
		{
			case 1:
					System.out.println("\nEnter the string: ");
					str = br.readLine();
					System.out.println("\nEnter the Character which you want to search: ");
					c = br.readLine();
					i = str.indexOf(c);
					if(i != -1)
					{
						System.out.println("Character is present at index location is '"+i+"'");
					}
					else
					{
						System.out.println("Character is not present.");
					}
					break;
					
			case 2:
					System.out.println("\nEnter the string: ");
					str = br.readLine();
					str1 = str.substring(str.length()-1);
					System.out.println("Last position of substring is '"+str1+"'");
					break;
					
			case 3:
					System.out.println("\nEnter the first string: ");
					str = br.readLine();
					System.out.println("\nEnter the second string: ");
					str1 = br.readLine();
					if(str.equals(str1))
					{
						System.out.println("Two strings are same.");
					}
					else
					{
						System.out.println("Two strings are not same.");
					}
					break;
					
			case 4:
					System.out.println("\nEnter the string: ");
					str = br.readLine();
					StringBuffer s = new StringBuffer(str);
					System.out.println("Reversed string is \""+s.reverse()+"\"");
					break;
					
			default:
					System.out.println("You are entered wrong choice?");
					break;
		}
	}
}
					