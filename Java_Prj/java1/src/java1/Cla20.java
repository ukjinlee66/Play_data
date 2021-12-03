package java1;

class A20 { int a = 200;}

class B20 extends A20 { int b = 100;}

public class Cla20 
{
	public static void main(String[] args) 
	{
		 A20 z1 = new A20();
		 B20 z2 = new B20();
		 A20 z3 = new B20();
		 B20 z4 = new A20();
		 //항상 자식 = 부모 는 불가능 부모가 자식의 값을 가지고 있지 않기 때문에.
		 // 부모 = 자식 관계만 성립 가능하다.
	}
}
