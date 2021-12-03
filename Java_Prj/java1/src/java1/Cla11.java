package java1;

class Point11
{
	int x, y;
	Point11() {}
	Point11(int x, int y)
	{
		this.x = x;
		this.y = y;
		System.out.println("(" + this.x + "," + this.y + ")");
	}
	void sum(int n1, int n2)
	{
		System.out.println(n1 + n2);
	}
	static Point11 sum(Point11 p1, Point11 p2)
	{
		Point11 ret = new Point11();
		ret.x = p1.x + p2.x;
		ret.y = p1.y + p2.y;
		System.out.println("(" + ret.x + "," + ret.y + ")");
		return (ret);
	}
	static Point11 psum(Point11 p1, Point11 p2)
	{
		Point11 ret = new Point11();
		ret.x = p1.x + p2.x;
		ret.y = p1.y + p2.y;
		return (ret);
	}
	static String psum(String s1, String s2)
	{
		String ret = "";
		ret += s1 + s2;
		return (ret);
	}
	void ppoint()
	{
		System.out.println("x : " + x + " y : " + y);
	}
	static Point11 pMove(Point11 p1, int x, int y)
	{
		Point11 ret = new Point11();
		ret.x = p1.x + x;
		ret.y = p1.y + y;
		return (ret);
	}
}

public class Cla11 
{

	public static void main(String[] args) 
	{
		Point11 p1 = new Point11(20, 10);
		
		Point11 p2 = new Point11(30, 20);
		
		Point11.sum(p1,p2);
		
		Point11 p3 = Point11.psum(p1, p2);
		
		String s3 = Point11.psum("대한", "민국");
		
		System.out.println(s3);
		
		System.out.println("(" + p3.x + "," + p3.y + ")");
		
		Point11 p4 = Point11.pMove(p1,15,25);
		
		System.out.println("(" + p4.x + "," + p4.y + ")");
	}

}
