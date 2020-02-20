class A
{
	final int rollno=10;
	
	final void show()
	{
		System.out.println("inside class A: "+rollno);
	}
}

class B extends A
{
	int rollno=20;
	
	void show()
	{
		System.out.println("inside class A: "+rollno);
	}
}

class FinalMethod
{
	public static void main(String args[])
	{
		A a1 = new A();
		B b1 = new B();
		
		A.show();
		B.show();
	}
}