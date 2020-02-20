class Company
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
		System.out.println("\nCompany Name is="+name);
		System.out.println("\nNo of emp is="+emp);
	}
		
   public static void main(String args[])
   {
     Company c1=new Company();
	 Company c2=new Company();
	 Company c3=new Company();
	 Company c4=new Company();
	 
	 c1.accept("Microsoft",11000);
	 c2.accept("HP",10000);
	 c3.accept("DEL",13000);
	 c4.accept("IBM",8000);
	 
	 if(c1.emp>10000)
	 {
		 c1.display();
	 }
	 if(c2.emp>10000)
	 {
		 c2.display();
	 }
	 if(c3.emp>10000)
	 {
		 c3.display();
	 }
	 if(c4.emp>10000)
	 {
		 c4.display();
	 }
   }
}