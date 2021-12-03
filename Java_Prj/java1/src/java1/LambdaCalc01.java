package java1;

interface iCalc01
{
	int Sum(int x);
}

interface iCalc02
{
	int Sum(int x, int y);
}

public class LambdaCalc01 {

	public static void main(String[] args) 
	{
		iCalc01 ic1 = new iCalc01() {
			public int Sum(int x) { return x + 1000;}
		};
		iCalc02 ic5 = new iCalc02()
		{
			public int Sum(int x, int y) {
				return (x + y + 500); 
			}
		};
		
		System.out.println(ic1.Sum(7));
		
		// Lambda 식 1
		iCalc01 ic2 = (x) -> {return x + 1000;};
		iCalc02 ic6 = (x, y) -> {return x + y + 10;};
		System.out.println(ic2.Sum(5));
		System.out.println(ic6.Sum(1, 2));
		// Lambda 식 2
		iCalc01 ic3 = (x) -> (x + 1000);
		iCalc02 ic7 = (x, y) -> (x + y + 10);
		System.out.println(ic3.Sum(3));
		System.out.println(ic7.Sum(3, 4));
		// Lambda 식 3
		iCalc01 ic4 = x -> x + 1000;
		iCalc02 ic8 = (x, y) -> x + y + 10;
		System.out.println(ic4.Sum(1));
		System.out.println(ic8.Sum(5, 6));
	}

}
