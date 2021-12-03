package java1;

public class Arr14 {

	public static void main(String[] args) 
	{
		String[] oldStrArray = {"Java", "array", "copy"};
		String[] newStrArray = new String[5];
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		for(String s : newStrArray)
			System.out.print(s + " ");
		System.out.println();
		
		System.out.println(oldStrArray == newStrArray);
		System.out.println(oldStrArray.equals(newStrArray));
		
		System.out.println(oldStrArray[1] == newStrArray[1]);
		System.out.println(oldStrArray[1].equals(newStrArray[1]));
	}

}
