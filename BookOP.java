import java.util.*;

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
		System.out.println("Book Name= "+title);
		System.out.println("Book Author= "+author);
		System.out.println("Book Publisher= "+pub);
		System.out.println("Book Price= "+price);
		System.out.println("Book Stock POS= "+stock_pos);
	}
}

class BookOP
{
	public static void main(String args[])
	{
		ArrayList<BookInfo> list = new ArrayList<BookInfo>();
		BookInfo B1 = new BookInfo("C++","Sarvesh","Books",400,20);
		BookInfo B2 = new BookInfo("OOP","DJ","New",800,40);
		
		list.add(B1);
		for(BookInfo bk:list)
		{
			System.out.println(bk);
		}
		//B1.show();
		//B2.show();
	}
}