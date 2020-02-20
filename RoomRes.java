class Room
{
	int l, b;
	
	Room(int x, int y)
	{
		l = x;
		b = y;
	}
	
	void area()
	{
		int area = l*b;
		System.out.println("Area of Room= "+area);
	}
}

class BedRoom extends Room
{
	int h;
	
	BedRoom(int a, int b, int c)
	{
		super(a,b);
		h = c;
	}
	
	void volume()
	{
		int vol = l*b*h;
		System.out.println("Volume of BedRoom= "+vol);
	}
}

class RoomRes
{
	public static void main(String args[])
	{
		BedRoom R1 = new BedRoom(10,20,30);
		R1.area();
		R1.volume();
	}
}