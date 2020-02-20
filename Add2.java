import java.io.*;

class Add2
{
			int num1, num2, sum;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			void accept()
			{
				try
				{
					System.out.println("\nEnter the two numbers: ");
					num1 = Integer.parseInt(br.readLine());
					num2 = Integer.parseInt(br.readLine());
				}
				catch(Exception e)
				{
					System.out.println("error");
				}
			}
			void display()
			
			{
				sum = num1+num2;
				System.out.println("\nSum of two Numbers: "+sum);
			}
			
		public static void main(String args[])
		{
			Add2 a = new Add2();
			a.accept();
			a.display();
		}
}