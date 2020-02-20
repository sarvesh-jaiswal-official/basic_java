import java.lang.*;
import java.io.*;

class Reversestring
{	
   public static void main(String args[])throws IOException
   {
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string: ");
					str = br.readLine();
					StringBuffer s = new StringBuffer(str);
					System.out.println("Reversed string is= "+s.reverse());
   }
}