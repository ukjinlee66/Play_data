package java1;

public class Meth02 
{
	
	public static int Sum1(int []iArr1)
	{
		int ret=0;
		for(int i=0;i<iArr1.length;i++)
			ret += iArr1[i];
		return (ret);
	}
	//가변적 매개변수 --> 가변길이 매개변수.
	public static int Sum2(int ... iArr1)
	{
		int ret=0;
		for(int i=0;i<iArr1.length;i++)
			ret += iArr1[i];
		return (ret);
	}
	
	public static void main(String[] args) 
	{
		int a=20, b=10, c=5, d=3, e=2;
		int[] iArr1 = {a,b,c};
		
		for(int i : iArr1)
			System.out.println(i);
		int ans = Sum2(iArr1);
		System.out.println(ans);
	}
}
