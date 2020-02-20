class Player
{
	String name;
	int matches;
	
	void accept(String n, int m)
	{
		name=n;
		matches=m;
	}
	void display()
	{
		System.out.println("\nName is="+name);
		System.out.println("\nNo of Matches is="+matches);
	}
		
   public static void main(String args[])
   {
     Player p1=new Player();
	 Player p2=new Player();
	 Player p3=new Player();
	 p1.accept("Sarvesh",300);
	 p2.accept("Rohit",200);
	 p3.accept("DJ",100);
	 if(p1.matches>p2.matches && p1.matches>p3.matches)
	 {
		 p1.display();
	 }
	 else if(p2.matches>p1.matches && p2.matches>p3.matches)
	 {
		 p2.display();
	 }
	 else
	 {
		 p3.display();
	 }
   }
}