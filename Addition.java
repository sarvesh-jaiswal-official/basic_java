class Addition
{
	public static void main(String args[])
	{
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
	
		if(num1>10 && num2>10)
		{
			int result=num1+num2;
			System.out.println("Addition = "+result);
		}
		else
		{
			System.out.println("Entered numbers are less than 10");
		}
	}
}