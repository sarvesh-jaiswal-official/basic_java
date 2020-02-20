class Choclate
{
	String choco_name;
	int choco_qty;
	
	Choclate(String x, int y)
	{
		choco_name = x;
		choco_qty = y;
	}
	
	void display()
	{
		System.out.println("Choclate name= "+choco_name);
		System.out.println("Choclate quantity= "+choco_qty);
	}
}

class ChocoFlavor extends Choclate
{
	String flavor_name;
	
	ChocoFlavor(String a, int b, String c)
	{
		super(a,b);
		flavor_name = c;
	}
	
	void display()
	{
		super.display();
		System.out.println("Flavor name= "+flavor_name);
	}
}

class ChoclateRes
{
	public static void main(String args[])
	{
		ChocoFlavor c1 = new ChocoFlavor("Silk",10,"Milk");
		ChocoFlavor c2 = new ChocoFlavor("DairyMilk",20,"Vanilla");
		c1.display();
		c2.display();
	}
}