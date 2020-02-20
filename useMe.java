package useful;

public class useMe
{
	int len, bth, mark1, mark2, total, bs, da, HRA, sal;
	
	public void get1(int a, int b)
	{
		len = a;
		bth = b;
	}
	
	public void get2(int a, int b, int c, int d)
	{
		bs = a;
		da = b;
		HRA = c;
		sal = d;
	}
	
	public void get3(int a, int b)
	{
		mark1 = a;
		mark2 = b;
	}
	
	public void area()
	{
		System.out.println("Length is "+len);
		System.out.println("Breadth is "+bth);
	}
	
	public void salary()
	{
		System.out.println("BS is "+bs);
		System.out.println("DA is "+da);
		System.out.println("HRA is "+HRA);
		System.out.println("Salary is "+sal);
	}
	
	public void per()
	{
		System.out.println("Mark1 is "+mark1);
		System.out.println("Marks is "+mark2);
		total = mark1+mark2;
		System.out.println("Total Marks is "+total);
	}
}
	
	