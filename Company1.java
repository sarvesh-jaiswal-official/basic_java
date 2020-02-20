class Company1
{
	String name;
	int emp;
	
	void accept(String n, int m)
	{
		name=n;
		emp=m;
	}
	void display()
	{
		if(emp>10000)
	 {
		System.out.println("\nCompany1 Name is="+name);
		System.out.println("\nNo of emp is="+emp);
	 }
	}
		
   public static void main(String args[])
   {
     Company1 c1=new Company1();
	 Company1 c2=new Company1();
	 Company1 c3=new Company1();
	 Company1 c4=new Company1();
	 
	 c1.accept("Microsoft",10000);
	 c2.accept("HP",14000);
	 c3.accept("DEL",13000);
	 c4.accept("IBM",8000);
	 
	 c1.display();
	 c2.display();
	 c3.display();
	 c4.display();
   }
}