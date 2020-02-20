class Student
{
	int roll_no;
	String name, branch;
	
	Student(int roll_no, String name, String branch)
	{
		this.roll_no=roll_no;
		this.name=name;
		this.branch=branch;
	}
	void display()
	{
		System.out.println("Roll No= "+roll_no);
		System.out.println("Name= "+name);
		System.out.println("Branch= "+branch);
	}
	
	public static void main(String args[])
	{
		Student s1=new Student(11,"Sarvesh","Co");
		Student s2=new Student(22,"Rohit","Co");
		
		s1.display();
		s2.display();
	}
}