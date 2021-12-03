package java1;

class Book31
{
	String title ="자바";
	class authore31
	{
		String name = "홍길동";
		String school = "대졸";
		String gender = "남성";
		int age = 30;
	}
	int price = 34000;
}

public class Cla31 {

	public static void main(String[] args) 
	{
		Book31 b1 = new Book31();
		System.out.println(b1.title);
		System.out.println(b1.price);
		
		Book31.authore31 a1 = b1.new authore31();
		System.out.println(a1.name);
		System.out.println(a1.school);
	}

}
