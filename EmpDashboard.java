import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Emp
{
	String id, pass1, pass2, name;
	long ph;
	int ch;
	float sal;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	void register() throws IOException
	{
		System.out.println("\n===REGISTRATION===");
		System.out.print("Enter your name : ");
		name = br.readLine();
		System.out.print("Enter your phone no : ");
		ph = Long.parseLong(br.readLine());
		
		while(!validPhone(ph))
		{
			System.out.println("error : plz enter valid 10 digit phone no...!");
			System.out.print("Enter phone no again : ");
			ph = Long.parseLong(br.readLine());
		}
		
		System.out.print("Enter your salary : ");
		sal = Float.parseFloat(br.readLine());
		System.out.print("Enter your email : ");
		id = br.readLine();
		System.out.print("Enter your password : ");
		pass1 = br.readLine();
		System.out.print("Confirm your password : ");
		pass2 = br.readLine();
		int i = confirmPass(pass1,pass2);
		
		if(i==1)
			System.out.println("Register Successfull...");
		else
			System.out.println("error : Registration Fail...!");	
	}
		
	void login() throws IOException
	{
		System.out.println("\n===LOGIN ACCOUNT===");
		System.out.print("ID : ");
		String tempID = br.readLine();
		System.out.print("Password : ");
		String tempPass = br.readLine();
			
		if(tempID.equals(id) && tempPass.equals(pass1))
		{
			System.out.println("Login Successful...");
			System.out.println("\n===Employee Dashboard===");
			System.out.println("Name : "+name);
			System.out.println("Phone No : "+ph);
			System.out.println("Salary : "+sal);
			System.out.println("Email : "+id);
		}
		else
		{
			System.out.println("error : Login Fail, plz try agian...!");
			System.out.println("Enter (Y/N) for Forgotton Password");
			String in = br.readLine();
			
			if(in.equals("y")||in.equals("Y"))
			{
				System.out.print("Enter your email id : ");
				String str = br.readLine();
				
				if(str.equals(id))
				{
					System.out.println("Enter you new Password : ");
					pass1 = br.readLine();
					System.out.println("Confirm your password : ");
					pass2 = br.readLine();
					System.out.println("Your Password Changed...");				
				}
				else
					System.out.println("error : email not found...!");
			}
		}
		
	}
	
	int confirmPass(String pass1,String pass2)
	{
		if(pass1.equals(pass2))
		{
			return 1;
		}
		else
			return 0;
	}
	
	boolean validPhone(long ph)
	{
		int count=0;
		while(ph>0)
		{
			ph=ph/10;
			count++;
		}
		if(count==10)
			return true;
		else
			return false;
	}
}

class EmpDashboard
{
	public static void main(String args[]) throws IOException
	{
		int ch;
		Emp e = new Emp();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println("\n===Welcome===");
			System.out.println("1.Register");
			System.out.println("2.Login");
			System.out.println("3.Exit");
			System.out.print("Enter your choice : ");
			ch = Integer.parseInt(br.readLine());
		
			switch(ch)
			{
				case 1: e.register();
						break;
			
				case 2: e.login();
						break;
			
				case 3: System.exit(0);		
			
				default: System.out.println("error : Plz enter valid choice...!");
			}
		}
	}
}