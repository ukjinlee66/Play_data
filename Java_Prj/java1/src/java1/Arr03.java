package java1;

public class Arr03 {

	public static void main(String[] args) 
	{
		int ans=0;
		int[] iArr1 = {10,20,30,40,50};
		
		for(int e: iArr1)
			ans += e;
		System.out.print(ans);
	}
}
