class Cube1
{
		int length, breadth, height;
		Cube1(int l, int b, int h)
		{
			length = l;
			breadth = b;
			height = h;
		}
		void display()
		{
			int volume = length*breadth*height;
			System.out.println("Volume of Cube= "+volume);
		}
			
		public static void main(String args[])
		{
			Cube1 m1=new Cube1(2,4,3);
			Cube1 m2=new Cube1(4,5,6);
			Cube1 m3=new Cube1(7,8,9);
			
			m1.display();
			m2.display();
			m3.display();
		}
}
		