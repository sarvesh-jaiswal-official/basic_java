import java.io.*;

class Add1
{
		public static void main(String args[])throws IOException
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("\nEnter the two numbers: ");
			int num1 = Integer.parseInt(br.readLine());
			int num2 = Integer.parseInt(br.readLine());
			int sum = num1+num2;
			System.out.println("\nSum of two Numbers: "+sum);
		}
}