import java.io.*;

class MyException extends Exception
{
	MyException(String msg)
	{
		super(msg);
	}
	
}

class userExp
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			System.out.println("Enter the no:" );
			int no = Integer.parseInt(br.readLine());
			
			if(no>0)
			{
				throw new MyException("no is positive");
			}
			else
			{
				throw new MyException("no is negative");
			}
		}
		
		catch(MyException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
