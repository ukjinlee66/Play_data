package java1;

public class Arr01 
{

	public static void main(String[] args) 
	{
		//int a;
		//System.out.println(a); // Stack의 값형 -> 자동 초기화 안됨.
		int[] iArr = {10,20,30};
		int jArr[]= {11,22,33};
		int[] mArr = new int[3];
//		mArr[0]=12;
//		mArr[1]=22;
//		mArr[2]=33;
		System.out.println(mArr[0]);
		mArr = null;
		System.out.println(mArr);
		int[] kArr = null;
	}

}
