class Constructor
{
	int x , y;
	
	Constructor()
	{
		x = 0;
		y = 0;
	}
	
	Constructor(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	void display()
	{
		System.out.print("\n X= "+x);
		System.out.print("   Y= "+y);
	}
	
	public static void main(String args[])
	{
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor(10,20);
		
		c1.display();
		c2.display();
	}
}