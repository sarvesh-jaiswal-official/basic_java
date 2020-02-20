class One
{
	int x;
	One(int x)
	{
		this.x = x;
	}
	void display()
	{
		System.out.println("\n Super X= "+x);
	}
}

class Second extends One
{
	int y;
	Second(int x, int y)
	{
		super(x);
		this.y = y;
	}
	void display()
	{
		super.display();
		System.out.println("\n Base X= "+x+"  Y= "+y);
	}
}

class Overtest
{
	public static void main(String args[])
	{
		Second s1 = new Second(100,200);
		s1.display();
	}
}