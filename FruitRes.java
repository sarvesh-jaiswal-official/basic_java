class fruits
{
	String countable;
	
	fruits(String a)
	{
		countable = a;
	}
	
	void display()
	{
		System.out.println("\nCountable= "+countable);
	}
}

class watermelon extends fruits
{
	float price;
	int qty;
	
	watermelon(String x, float y, int z)
	{
		super(x);
		price = y;
		qty = z;
	}
	
	void show()
	{
		display();
		System.out.println("Price= "+price);
		System.out.println("Quantity= "+qty);
	}
}

class FruitRes
{
	public static void main(String args[])
	{
		watermelon w1 = new watermelon("Yes",200,10);
		watermelon w2 = new watermelon("Yes",50,30);
		watermelon w3 = new watermelon("No",20,20);
		
		w1.show();
		w2.show();
		w3.show();
	}
}