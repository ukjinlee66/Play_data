package java1;

public class Meth03 
{
	public static void Sum1(String ... str)
	{
		String ret="";
		for(String s : str)
			ret += s;
		System.out.println(ret);
	}
	public static void main(String[] args) 
	{
		String s1 ="감", s2="밤",s3="배",s4="귤",s5="콩";
		Sum1(s1,s2,s3,s4,s5);
		Sum1(s1,s2,s3);
	}

}
