package java1;

class A13
{
	int iA = 100;
}
class B13 extends A13
{
	int iB = 200;
}

class C13 extends B13
{
	int iC = 300;
	
}

public class Cla13 {

	public static void main(String[] args) 
	{
		A13 a1 = new A13();
		
		B13 b1 = new B13();
		
		C13 c1 = new C13();
		
		System.out.println(a1.iA);
		
		System.out.println(b1.iB);
		
		System.out.println(c1.);
	}

}
