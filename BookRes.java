class Book
{
	String author, title, pub;
	
	Book(String a, String b, String c)
	{
		title = b;
		author = a;		
		pub = c;
	}
}

class BookInfo extends Book
{
	float price;
	int stock_pos;
	
	BookInfo(String x, String y, String z, float m, int n)
	{
		super(x,y,z);
		price = m;
		stock_pos = n;
	}
	
	void show()
	{
		System.out.println("\nBook Name= "+title);
		System.out.println("Book Author= "+author);
		System.out.println("Book Publisher= "+pub);
		System.out.println("Book Price= "+price);
		System.out.println("Book Stock POS= "+stock_pos);
	}
}

class BookRes
{
	public static void main(String args[])
	{
		BookInfo B1 = new BookInfo("C++","Sarvesh","Books",400,20);
		BookInfo B2 = new BookInfo("OOP","DJ","New",800,40);
		BookInfo B3 = new BookInfo("JAVA","SON","New",600,50);
		B1.show();
		B2.show();
		B3.show();
	}
}