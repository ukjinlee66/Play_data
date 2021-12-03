package java1;

public class MemoryEX {

	public static void main(String[] args) 
	{
		int sum = 0;
		if( sum == 0)
		{
			int i = 10;
			int j = 20;
			sum = add(i,j);
		}
		System.out.println(sum);
	}
	static int add(int a, int b)
	{
		return (a+b);
	}
}
