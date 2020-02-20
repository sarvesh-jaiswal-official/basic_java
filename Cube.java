import java.io.*;

class Cube
{
		int length, breadth, height;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		void accept()
		{
			try
			{
				System.out.println("Enter the Length: ");
				length = Integer.parseInt(br.readLine());
				System.out.println("Enter the Breadth: ");
				breadth = Integer.parseInt(br.readLine());
				System.out.println("Enter the Height: ");
				height = Integer.parseInt(br.readLine());
			}
			catch(Exception e)
			{
				System.out.println("error");
			}
		}
		void display()
		{
			int volume = length*breadth*height;
			System.out.println("Volume of Cube= "+volume);
		}
			
		public static void main(String args[])
		{
			Cube m1=new Cube();
			Cube m2=new Cube();
			Cube m3=new Cube();
			
			m1.accept();
			m2.accept();
			m3.accept();
			
			m1.display();
			m2.display();
			m3.display();
		}
}
		