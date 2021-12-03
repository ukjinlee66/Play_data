package java1;
import java.util.Scanner;
public class if01 
{

	public static void main(String[] args) 
	{
		
		//입력 숫자가 홀수 짝수 출력
		System.out.println("숫자 입력=> ");
		//입력 : Scanner
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		//파악 : n 을 2로 나눈 나머지가 1이면 홀수.
		if  ((n % 2) == 1)
			System.out.println("홀수");
		else
			System.out.println("짝수");
		//출력 :System.out.println();
	}

}
