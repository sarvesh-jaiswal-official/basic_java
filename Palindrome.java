class Palindrome
{	
   public static void main(String args[])
   {
		int num=Integer.parseInt(args[0]);
		int n=num;
		int reverse=0;
		int remainder;
		while(num>0)
		{
			remainder=num%10;
			reverse=(reverse*10)+remainder;
			num=num%10;
		}
		if(reverse==n)
		{
			System.out.println(n+" is Palindrome number.");
		}
		else
		{
			System.out.println(n+" is Not Palindrome number.");
		}
   }
}