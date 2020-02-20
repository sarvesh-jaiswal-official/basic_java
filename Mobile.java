import java.lang.*;
import java.io.*;

class Mobile
{
		String company_name;
		int screen_size;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		void accept()
		{
			try
			{
				System.out.println("Enter the Company Name: ");
				company_name = br.readLine();
				System.out.println("Enter the Screen Size: ");
				screen_size=Integer.parseInt(br.readLine());
			}
			catch(Exception e)
			{
				System.out.println("error");
			}
		}
		void display()
		{
			System.out.println("Company Name= "+company_name);
			System.out.println("Screen Size= "+screen_size);
		}
			
		public static void main(String args[])throws IOException
		{
			Mobile m[]=new Mobile[5];
			for(int i=0; i<=4; i++)
			{
				m[i]=new Mobile();
			}
			for(int i=0; i<=4; i++)
			{
				m[i].accept();
			}
			for(int i=0; i<=4; i++)
			{
				m[i].display();
			}
		}
}
		