class ArrayDir
{
	public static void main(String args[])
	{
		int array[] = {10,20,30,40,50,0,0};
		array[5] = 60;
		array[6] = 70;
		
		for(int k=0; k<array.length; k++)
		{
			System.out.println(array[k]);
		}
	}
}