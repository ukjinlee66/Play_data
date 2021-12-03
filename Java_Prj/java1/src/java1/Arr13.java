package java1;

import java.util.Arrays;

public class Arr13 {

	public static void main(String[] args) 
	{
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		//System.out.println(newIntArray[2]);
		for(int i=0;i<oldIntArray.length;i++)
			newIntArray[i] = oldIntArray[i];
		for(int j : newIntArray)
			System.out.print(j + " ");
		int[] iArr1 = {10,20,30};
		int[] iArr2 = Arrays.copyOf(iArr1,  iArr1.length);
		
		System.out.println(iArr1 == iArr2);
		System.out.println(iArr1.equals(iArr2));
		
		System.out.println(iArr1[1] + "," + iArr2[1]);
		
		int[] iArr3 = new int[5];
		
		System.arraycopy(iArr1, 0, iArr3,0,iArr1.length);
		for(int j : iArr3)
			System.out.print(j+" ");
		
	}

}
