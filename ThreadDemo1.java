class Even implements Runnable 
{
	public void run()
	{
		for(int i=0; i<=20; i++)
		{	
			if(i%2==0)
			{	
				System.out.println(i);
			}
		}
	}
}

class Odd implements Runnable
{
	public void run()
	{
		for(int i=0; i<=20; i++)
		{	
			if(i%2!=0)
			{	
				System.out.println(i);
			}
		}
	}
}

class ThreadDemo1
{
	public static void main(String args[])
	{
		Even A1 = new Even();
		Odd O1 = new Odd();
		Thread t1 = new Thread(A1);
		Thread t2 = new Thread(O1);
		t1.start();
		t2.start();
	}
}