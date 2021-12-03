package java1;

import java.util.Scanner;

public class if03 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력=> ");
		int var = sc.nextInt();
		sc.close();
		if (var % 2 == 0 && var % 3 == 0)
			System.out.println("6의배수 ");
		else
			System.out.println("Not");
	}

}
