import java.lang.*;

class Substring
{	
   public static void main(String args[])
   {
		String str, str1;
		str = args[0];
		int i = str.length();
		System.out.println("Substring of '"+str+"' are: ");
		for(int k=0; k<i; k++)
		{
			str1 = str.substring(k);
			System.out.println(str1);
		}
   }
}