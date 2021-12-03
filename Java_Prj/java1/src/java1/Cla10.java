package java1;

class Calc10
{
	void sum(int i, int j) {System.out.println("덧셈 : "+ (i+j));}
	void sub(int i, int j) {System.out.println("덧셈 : "+ (i-j));}
	void mul(int i, int j) {System.out.println("덧셈 : "+ (i*j));}
	void div(int i, int j) {System.out.println("덧셈 : "+ (i/j));}
}

public class Cla10 {

	public static void main(String[] args) {
		int a=20,b=10;
		Calc10 c1 = new Calc10();
		c1.sum(a,b);
		c1.sub(a,b);
		c1.mul(a,b);
		c1.div(a,b);
	}

}
