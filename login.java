import java.io.*;

class MyException extends Exception
{
	MyException(String msg)
	{
		super(msg);
	}
}

class login
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pass;
		String user;
		System.out.println("Enter the UserId & Password");
		System.out.print("UserId: ");
		user = br.readLine();
		System.out.print("Password: ");
		pass = Integer.parseInt(br.readLine());
		
		try
		{
			if(user.length()>6 && pass==12345)
			{
				throw new MyException("Login Succesfull");
			}
			else
			{
				throw new MyException("Authentication Failed");
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
		