package java1;

public class Arr02 {

	public static void main(String[] args) 
	{
		int[] iArr = new int[3];
		System.out.println(iArr[0]);
		System.out.println(iArr.length);
		String[] sArr = new String[10];
		System.out.println(sArr[0]);
		System.out.println(sArr.length);
		
		iArr[0] = 10; iArr[1] = 20; iArr[2] = 30;
		int a = 10;
		
		System.out.println(a == iArr[0]);
		
		String[] sArr2 = new String[] {"감",  "밤", "배"};
		String s = "감";
		
		System.out.println(s == sArr2[0]);
		
	}
}
