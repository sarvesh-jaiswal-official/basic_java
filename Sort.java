class Sort
{	
   public static void main(String args[])
   {
		int a[]=new int[5];
		int i;
		for(i=0; i<=5; i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		for(i=0; i<=5; i++)
		{
			for(int k=i+1; k<=5; i++)
			{
				if(a[i]>a[k])
				{
					int t=a[i];
					a[i]=a[k];
					a[k]=t;
				}
			}
		}
		for(i=0; i<=5; i++)
		{
			System.out.println(a[i]);
		}
   }
}