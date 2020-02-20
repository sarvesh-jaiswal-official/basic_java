import java.lang.*;
import java.io.*;

class DecToBin
{
		public static void main(String args[])throws IOException
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("\nEnter the Decimal Value: ");
			String hex = br.readLine();
			int i = Integer.parseInt(hex);
			String bin = Integer.toBinaryString(i);
			System.out.println("\nBinary: "+bin);
		}
}