class Primeno
{	
   public static void main(String args[])
   {
		int num=Integer.parseInt(args[0]);
		int flag=0;
		for(int i=2; i<=num; i++)
		{
			if(num%i==0)
			{
				System.out.println(num+"is not prime number");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(num+"is prime number");
		}
   }
}