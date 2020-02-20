class swap
{
	public static void main(String args[])
	{
		int num1=10, num2=20;
		
		System.out.println("\nBefore Swapping Numbers Are: \nA = "+num1+"\nB = "+num2);
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("\nAfter Swapping Numbers Are: \nA = "+num1+"\nB = "+num2);
	}
}