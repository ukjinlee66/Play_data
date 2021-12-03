package java1;

class Ani17
{
	String a = "Ani-a";
	void cry() { System.out.println("으 앙");}
	void shout() { System.out.println("으으 ");}
}

class Dog17 extends Ani17{
	String a = "Dog-a";
	
	void pDog() {
		System.out.println(this.a);
		System.out.println(super.a);
	}
		void cry() 
		{ 
			System.out.println("멍 멍");
			super.cry();
		}
		@Override
		void shout() { System.out.println("으으 ");}
}



public class Cla17 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Dog17 d1 = new Dog17();
		
		//System.out.println(d1.a);
		d1.pDog();
		d1.cry();
	}

}
