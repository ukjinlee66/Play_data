package java1;

import java.util.Scanner;
public class Try01 {

	public static void main(String[] args) 
	{
		System.out.println("숫자 입력 =>");
		Scanner sc = new Scanner(System.in);
		try
		{
		int si = sc.nextInt();
		int so = 100/si;
		System.out.println(so);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("0은 안되요.");
		}
		catch(java.util.InputMismatchException e)
		{
			System.out.println(e);
			System.out.println("형식이 안맞습니다.");
		}
		finally
		{
			System.out.println("-- 항상 실행됨 --");
		}
		
		sc.close();
		
		void sum() throws Exception {}
	}

}
