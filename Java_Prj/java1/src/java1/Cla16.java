package java1;

class Ani16{
	String name = "이 름";
	void cry() {System.out.println("으 아");}
	Ani16() { System.out.println("--Ani16() 실행--");}
}

class Dog16 extends Ani16{
	Dog16() { System.out.println("--Dog16() 실행--");}
}

class Cat16 extends Ani16{
	Cat16() { System.out.println("--Cat16() 실행--");}
}

public class Cla16 {

	public static void main(String[] args) {
		Dog16 d1 = new Dog16(); d1.name = "해피";
		Cat16 c1 = new Cat16(); c1.name = "아치";

	}

}
