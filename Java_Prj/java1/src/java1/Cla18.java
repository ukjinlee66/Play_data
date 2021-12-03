package java1;

class Ani18 {
	String name;
}

class Dog18 extends Ani18
{
	Dog18()
	{
		super.name = "default";
	}
	Dog18(String name)
	{
		super.name = name;
	}
}

public class Cla18 
{

	public static void main(String[] args) 
	{
		Dog18 d1 = new Dog18();
		Dog18 d2 = new Dog18("해 피");
		
		System.out.println(d2.name);
	}

}
