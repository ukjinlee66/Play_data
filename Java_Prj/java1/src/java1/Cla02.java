package java1;

public class Cla02 
{
	public static void main(String[] args) 
	{
		Book02 b1 = new Book02();
		b1.pBook();
		b1.title = "자바";b1.author="Tom"; b1.price=30000;
		b1.pBook();
		
		Book02 b2 = new Book02();
		b2.title="OOP";
		b2.author="Jane";
		b2.price=40000;
		b2.pBook();
		
		
	}
}
