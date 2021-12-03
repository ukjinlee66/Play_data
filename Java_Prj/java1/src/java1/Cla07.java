package java1;

class Book07 
{
	String	title;
	String	author;
	int			price;
	void pBook()
	{
		System.out.println(title + "," + author + "," + price);
	}
	Book07(String t, String a, int p)
	{
		title = t;
		author = a;
		price = p;
	}
}

public class Cla07 
{

	public static void main(String[] args) 
	{
		Book07 b1 = new Book07("Java", "Jane", 30000);
		b1.pBook();
	}

}
