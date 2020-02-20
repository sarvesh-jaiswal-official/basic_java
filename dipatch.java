class A
{
	void show()
	{
		System.out.println("inside class A");
	}
}

class B
{
	void show()
	{
		System.out.println("inside class B");
	}
}

class dipatch
{
	public static void main(String args[])
	{
		A obj1 = new A();
		B obj2 = new B();
		A a1;
		B b1;
		a1 = obj1;
		a1.show();
		b1 = obj2;
		b1.show();
	}
}