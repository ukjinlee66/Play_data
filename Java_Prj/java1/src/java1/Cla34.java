package java1;

class Book34 extends Object //Object class가 은닉되어 있다.
{
	// Book34(){}
	String title = "무제";
	String author = "미상";
	int price = 0;
	
	@Override
	public String toString()
	{
		String info = this.title + "," + this.author + "," + this.price;
		return info;
	}
}

class A34 extends Book34{}

public class Cla34 {

	public static void main(String[] args) 
	{
		Book34 b1 = new Book34();
		System.out.println(b1.toString());
		
		String s1 = "Kr";
		System.out.println(s1);
		System.out.println(s1.toString());
	}

}
