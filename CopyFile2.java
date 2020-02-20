import java.io.*;

public class  CopyFile2
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try
		{
			File a = new File("C:/Users/PL-01/Sarvesh/Simple Program/TempFile/abc.txt");
			File b = new File("C:/Users/PL-01/Sarvesh/Simple Program/TempFile/xyz.txt");
			in = new FileInputStream(a);
			out = new FileOutputStream(b);
			byte buffer[] = new byte[1024];
			int len;
			
			while((len = in.read(buffer))>0)
			{
				out.write(buffer,0,len);
			}
			in.close();
			out.close();
			System.out.println("File Copied Successfully");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}