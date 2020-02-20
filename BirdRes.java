class Bird
{
	String category;
	
	Bird(String a)
	{
		category = a;
	}
	
	void show()
	{
		System.out.println("Bird Category= "+category);
	}
}

class Parrot extends Bird
{
	int no_of_parrot;
	
	Parrot(String x, int z)
	{
		super(x);
		no_of_parrot = z;
	}
	
	void show()
	{
		super.show();
		System.out.println("No of Parrots= "+no_of_parrot);
	}
}

class BirdRes
{
	public static void main(String args[])
	{
		Parrot P1 = new Parrot("Bird",10);
		P1.show();
	}
}