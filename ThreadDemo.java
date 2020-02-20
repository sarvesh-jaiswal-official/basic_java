class Ascending extends Thread
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{	
			System.out.println(i);
		}
	}
}
		
class Descending extends Thread
{
	public void run()
	{
		for(int i=10; i>=1; i--)
		{	
			System.out.println(i);
		}
	}
}

class ThreadDemo
{
	public static void main(String args[])
	{
		Ascending A1 = new Ascending();
		Descending D1 = new Descending();
		A1.start();
		D1.start();
	}
}