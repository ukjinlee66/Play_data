package java1;

//final 클래스 => 상속불가 

class A19{
final int a1 = 2000;
final int a2;
A19(int a2) {this.a2 = a2;}
	static final int b1 = 7777; //자바에서의 상수
	final void Hi() { System.out.println("HI");}
	void Bye() {System.out.println("잘가 TT");}
}

class B19 extends A19
{
	//final 메소드 => 오버라이딩 불가.
	B19(int a2) { super(a2);}
	void Bye() { System.out.println("잘가 TT");}
}

public class Cla19 {

	public static void main(String[] args) 
	{
		
	}

}
