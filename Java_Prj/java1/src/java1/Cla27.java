package java1;

interface iAnimal27 // interface -->기본적으로 추상 method 선언.
{
	void Cry();
	void Shout();
}

class Dog27 implements iAnimal27
{
	public void Cry()
	{
		System.out.println("멍 멍");
	}
	public void Shout() 
	{
		System.out.println("므르렁");
	}
}

public class Cla27 
{

	public static void main(String[] args) 
	{

	}

}