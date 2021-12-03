package java1;

class Gen01<T>
{
	T z;
	void Setz(T z) { this.z = z;}
	T getz() {return this.z;}
}

class Gen02<T>
{
	void sum(T i, T j) 
	{
		System.out.println(i+","+j);
	}
}

class Gen03<T, K>
{
	K name;
	T title;
	void sum(K i, T j) { System.out.println(i + "," + j);}
}

public class GenEx01 {

	public static void main(String[] args) 
	{
		Gen01<String> g11 = new Gen01<String>();
		g11.Setz("Java");
		System.out.println(g11.getz());
		
		Gen01<Integer> g12 = new Gen01<Integer>();
		g12.Setz(1000);
		System.out.println(g12.getz());
		
		Gen01<String> g13 = new Gen01();
		g13.Setz("Hello");
		System.out.println(g13.getz());
	}

}
