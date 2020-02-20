import java.io.*;

public class  CopyFile
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileInputStream in = null;
		FileOutputStream out = null;
		String choice;
		
		try
		{
			System.out.println("Do You want to copy file data?(y/n)");
			choice = br.readLine();
			if(choice.equals("y"))
			{	
				in = new FileInputStream("C:/Users/Admin/Sarvesh/Simple Program/Temp File/abc.txt");
				out = new FileOutputStream("C:/Users/Admin/Sarvesh/Simple Program/Temp File/xyz.txt");
				int c;
				while((c = in.read()) != -1)
				{
					out.write(c);
				}
				System.out.println("\nFile Copied Successfully");
			}
			if(choice.equals("n"))
			{
				System.out.println("\nCancelled...");
			}
		}
		finally
		{
			if(in != null)
			{
				in.close();
			}
			
			if(out != null)
			{
				out.close();
			}
		}
	}
}