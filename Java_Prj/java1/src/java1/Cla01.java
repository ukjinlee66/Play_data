package java1;

class Book01
{
	String	title;
	String	author;
	int			price;
	Book01()
	{
		this.title = "Default title";
		this.author = "Default Author";
		this.price = -1;
	}
	Book01(String title)
	{
		this.title = title;
	}
	Book01(String title, String author)
	{
		this.title = title;
		this.author = author;
	}
	Book01(String title, String author, int price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void pBook()
	{
		System.out.println(title + "," + author + "," + price);
	}
	void set_value(String title, String author, int price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}
}

public class Cla01 {

	public static void main(String[] args) 
	{
		Book01 b1 = new Book01();
		b1.title = "자바의정석"; b1.author = "Tom"; b1.price = 30000;
		b1.pBook();
		//System.out.println(b1.title+"," + b1.author+","+b1.price);
		
		Book01 b2 = new Book01();
		b2.title = "SQL"; b2.author = "Tom"; b2.price = 30000;
		b2.pBook();
	}

}
