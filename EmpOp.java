import java.io.*;

class Employee
{
	int empid, sal;
	String name;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	void accept()
	{
		try
		{
			System.out.println("Enter the EmpId: ");
			empid = Integer.parseInt(br.readLine());
			System.out.println("Enter the Name: ");
			name = br.readLine();
			System.out.println("Enter the salary: ");
			sal = Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	void display()
	{
		System.out.println("EmpId= "+empid);
		System.out.println("Name= "+name);
		System.out.println("salary= "+sal);
	}
}

class EmpOp
{
	public static void main(String args[]) throws IOException
	{	
		Employee s1[] = new Employee[5];
		
		for(int i=0; i<5; i++)
		{
			s1[i] = new Employee();
		}
		
		for(int i=0; i<5; i++)
		{
			s1[i].accept();
		}
		
		for(int i=0; i<5; i++)
		{
			s1[i].display();
		}
	}
}