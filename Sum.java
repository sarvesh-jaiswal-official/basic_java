class Sum
{
	public static void main(String args[])
	{
		int sum=0;
		int num=0;
		for(int i=101; i<200; i++)
		{
			if(i%7==0)
			{
				sum = sum+i;
				num++;
			}
		}
		System.out.println("No of elements: "+num);
		System.out.println("Sum of element: "+sum);
	}
}