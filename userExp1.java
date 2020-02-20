import java.io.*;

class userExp1
{
	public static void main(String args[])throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int no;
		
		while(true)
		{
			try
			{	
				System.out.println("\nEnter the no: ");
				no = Integer.parseInt(br.readLine());
				break;
			}
	
			catch(Exception e)
			{
				System.out.println("Pls Enter the only Integer value\nPls try again...");
				continue;
			}
		}
		System.out.println("Num is "+no);
	}
}
