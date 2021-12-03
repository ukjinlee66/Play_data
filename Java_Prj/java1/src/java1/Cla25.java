package java1;

abstract class Ani25
{
	abstract void	cry(); // 추상 method --> 선언
	void shout() {
		System.out.println("으르렁");
	} // 일반 method --> 선언 + 구현
	void walk() {
		System.out.println("걸어");
	}
}

class Dog25 extends Ani25
{
	void cry() { // 추상 --> 구현
		System.out.println("으앙");
	}
	void jump() { // 하위 구현
		System.out.println("깡 총");
	}
	@Override
	void walk() { // Override
		System.out.println("걸을래");
	}
}

public class Cla25 {

	public static void main(String[] args) 
	{
		Dog25 d1 = new Dog25();
		d1.cry();
		d1.shout();
		d1.jump();
		d1.walk();
	}

}
