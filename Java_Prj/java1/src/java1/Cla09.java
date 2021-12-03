package java1;

class Book09 
{
	String	title;
	String	author;
	int			price;
	void pBook()
	{
		System.out.println(title + "," + author + "," + price);
	}
	Book09(){}
	Book09(String title)
	{
		this.title = title;
	}
	Book09(String title, String author)
	{
		this.title = title;
		this.author = author;
	}
	Book09(String title, String author, int price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}
}

public class Cla09 
{
	public static void main(String[] args) 
	{
		Book09 b1 = new Book09();
		Book09 b2 = new Book09("Java");
		Book09 b3 = new Book09("Java","Jane");
		Book09 b4 = new Book09("Java","Jane",30000);
		b1.pBook();
		b2.pBook();
		b3.pBook();
		b4.pBook();
	}
}
