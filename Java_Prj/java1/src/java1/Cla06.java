package java1;

class Book06 
{
	String	title = "무제";
	String	author = "미상";
	int			price = 0;
	void pBook()
	{
		System.out.println(title + "," + author + "," + price);
	}
	Book06(String title, String author, int price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}
	Book06(String title)
	{
		this.title = title;
	}
	Book06(String title, String author)
	{
		this.title = title;
		this.author = author;
	}
}

public class Cla06 
{

	public static void main(String[] args) 
	{
		Book06 b1 = new Book06("Java","Tom",30000);
		b1.pBook();
		Book06 b2 = new Book06("Java");
		b2.pBook();
		Book06 b3 = new Book06("Java","Tom");
		b3.pBook();
	}

}
