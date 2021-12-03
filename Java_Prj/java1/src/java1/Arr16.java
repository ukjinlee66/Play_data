package java1;

import java.util.Arrays;

public class Arr16 {

	public static void main(String[] args) 
	{
		int[][] original = {{1,2},{3,4}};
		
		
		int[][] clone02 = Arrays.copyOf(original, original.length);
		clone02[0] = Arrays.copyOf(original[0], original[0].length);
		clone02[1] = Arrays.copyOf(original[1], original[1].length);
		
		System.out.println(original == clone02);
		
		System.out.println(Arrays.equals(original, clone02));
		
		System.out.println(Arrays.deepEquals(original, clone02));
		
	}

}
