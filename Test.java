class Test
{
	String show(String x)
	{
			String str, str1="";
		for(int i=0; i<x.length(); i++)
		{
			char a = x.charAt(i);
			
			str = Character.toString(a);
			str1 =str1.concat(str);
		}
		return str1;
	}
public static void main(String args[])
{
	Test t = new Test();
	String a="";
	String xx = "sarveshkumar jaiswal sarveshkumar jaiswal";
	xx.length();
	int count=0;
	int c=-2;
	while(c<0)
	{
		c++;
	a= xx.substring(count,count+8);
	count=count+8;
		System.out.println(a);
	}

}
}