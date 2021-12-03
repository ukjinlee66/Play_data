package java1;

class Sing12
{
	private static Sing12 sing = new Sing12();
	private Sing12()
	{
		System.out.println("Sing12() 실행");
	}
	static Sing12 getInstance() { return sing;}
}

public class Cla12 
{
	public static void main(String[] args) 
	{
		Sing12 s1 = Sing12.getInstance();
		Sing12 s2 = Sing12.getInstance();
		Sing12 s3 = Sing12.getInstance();
	}
}
