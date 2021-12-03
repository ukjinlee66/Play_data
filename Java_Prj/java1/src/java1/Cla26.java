package java1;

abstract class Ani26
{
	abstract void Cry();
}

class Dog26 extends Ani26
{
	@Override
	void Cry()
	{
		System.out.println("멍멍");
	}
}

class Cat26 extends Ani26
{
	@Override
	void Cry()
	{
		System.out.println("야옹");
	}
}

class Duck26 extends Ani26
{
	@Override
	void Cry()
	{
		System.out.println("꽥 꽥");
	}
}

public class Cla26 {

	public static void main(String[] args) {
		Ani26[] Anis = {new Dog26(), new Cat26(), new Duck26()};
		
		for (Ani26 A : Anis)
			A.Cry();
	}

}
