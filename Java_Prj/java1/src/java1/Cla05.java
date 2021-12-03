package java1;
class Calc05
{
	static int sum(int n1,int n2)
	{
		return n1 + n2;
	}
	static int sum(int n1,int n2,int n3)
	{
		return n1 + n2 + n3;
	}
	static int sum(int n1,int n2,int n3,int n4)
	{
		return n1 + n2 + n3 + n4;
	}
	static String sum(String s1, String s2)
	{
		return (s1 + s2);
	}
	static int sub(int n1,int n2)
	{
		return n1 - n2;
	}
	
}
public class Cla05 {

	public static void main(String[] args) 
	{
		System.out.println(Calc05.sum(20,10)); // 30
		System.out.println(Calc05.sub(20,10)); // 10
		System.out.println(Calc05.sum(20,10,5)); // 35
		System.out.println(Calc05.sum(20,10,5,3)); // 38
		System.out.println(Calc05.sum("대한","민국")); // 대한민국
	}

}
