package java1;

import java.util.Arrays;
import java.util.Scanner;
public class back 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str2 = sc.nextLine();
		char str[] = str2.toCharArray();
		int arr[] = new int[26];
		Arrays.fill(arr, -1);
		for(int i=0;i<str.length;i++)
		{
			if (arr[str[i]-'a'] == -1)
				arr[str[i]-'a'] = i;
		}
		for(int i=0;i<arr.length;i++)
		{
			if (i == arr.length - 1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i]+" ");
		}
	}
}
