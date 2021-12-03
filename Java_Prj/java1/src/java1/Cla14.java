package java1;

class A14
{
	int aField01 = 10;
	int aField02 = 100;
	int aField03 = 1000;
	int aField04 = 10000;
}
class B14 extends A14
{
	int bField01 = 20;
}

public class Cla14 
{

	public static void main(String[] args) 
	{
		A14 a = new A14();
		B14 b = new B14();
		
		System.out.println(b.aField01);
		System.out.println(b.aField02);
		System.out.println(b.aField03);
		System.out.println(b.aField04);
		
		
	}

}
