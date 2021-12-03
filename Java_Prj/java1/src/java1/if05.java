package java1;
import java.util.Scanner;

public class if05 {

	public static void main(String[] args) 
	{
		int iKr, iEn,Sum,Avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("영어, 국어 점수를 입력.");
		iKr = sc.nextInt();
		iEn = sc.nextInt();
		Sum = iKr + iEn; Avg = Sum / 2;
		sc.close();
		if (iKr < 60 || iEn < 60)
		{
			System.out.println("과목낙제.");
			return;
		}
		if (Avg >= 90)
			System.out.println("우수.");
		else if (Avg >= 80)
			System.out.println("보통.");
		else if (Avg >= 70)
			System.out.println("부족.");
		else
			System.out.println("평균낙제.");
	}

}
