import java.io.*;

class Student
{
	int roll_no, age;
	String name;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	void accept()
	{
		try
		{
			System.out.println("Enter the Roll No: ");
			roll_no = Integer.parseInt(br.readLine());
			System.out.println("Enter the Name: ");
			name = br.readLine();
			System.out.println("Enter the Age: ");
			age = Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	void display()
	{
		System.out.println("Roll No= "+roll_no);
		System.out.println("Name= "+name);
		System.out.println("Age= "+age);
	}
}

class StdOp
{
	public static void main(String args[]) throws IOException
	{	
		Student s1[] = new Student[5];
		
		for(int i=0; i<5; i++)
		{
			s1[i] = new Student();
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