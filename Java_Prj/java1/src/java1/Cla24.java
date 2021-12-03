package java1;

class Ani24
{
	void Cry()
	{
		System.out.println("으 앙");
	}
}

class Dog24 extends Ani24
{
	@Override
	void Cry()
	{
		System.out.println("멍멍");
	}
}

class Cat24 extends Ani24
{
	@Override
	void Cry()
	{
		System.out.println("야옹");
	}
}

class Duck24 extends Ani24
{
	@Override
	void Cry()
	{
		System.out.println("꽥 꽥");
	}
}

public class Cla24 
{
	public static void main(String[] args) 
	{
		Dog24 D1 = new Dog24();
		 Cat24 C1 = new Cat24();
		 Duck24 D2 = new Duck24();
		 D1.Cry();
		C1.Cry();
		D2.Cry();
		
		Ani24[] Arr = {new Dog24(), new Cat24(), new Duck24()};
		 for (Ani24 A : Arr)
		 {
			 A.Cry();
		 }
		 ///////////////////////
//		short a1 = 10; int a2 = 20; short a3 = 30; int a4 = 40;
//		int[] iArr = new int[4];
//		iArr[0] = a1; iArr[1] = a2; iArr[2] = a3; iArr[3] = a4;
//		for(int i : iArr)
//			System.out.println(i);
	}

}
