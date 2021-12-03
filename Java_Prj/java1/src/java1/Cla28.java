package java1;
interface iAnimal28 // interface -->기본적으로 추상 method 선언.
{
	abstract void Cry();
}

class Dog28 implements iAnimal28
{
	public void Cry()
	{
		System.out.println("멍 멍");
	}
}

class Cat28 implements iAnimal28
{
	public void Cry()
	{
		System.out.println("야옹");
	}
}

class Duck28 implements iAnimal28
{
	public void Cry()
	{
		System.out.println("꽥 꽥");
	}
}

public class Cla28 {

	public static void main(String[] args) 
	{
		Dog28 d1 = new Dog28();
		d1.Cry();
		iAnimal28 d2 = new Dog28();
		d2.Cry();
		iAnimal28[] Anis = {new Dog28(), new Cat28(), new Duck28()};
		for(iAnimal28 A : Anis)
			A.Cry();
	}

}
