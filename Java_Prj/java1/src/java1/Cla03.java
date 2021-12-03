package java1;

class	Calc03
{
	//Instance Member
	void Sum(int i, int j) {System.out.println(i+j);}
	
	//Static Member
	static void Mul(int i, int j) { System.out.println(i*j);}
}

public class Cla03 
{
	static void	Sub(int i,int j) {System.out.println(i-j);}
	public static void main(String[] args) 
	{
		int a = 20, b = 10;
		
		Calc03 c1 = new Calc03();
		c1.Sum(a,b);
		
		Calc03.Mul(a, b);
	}

}
