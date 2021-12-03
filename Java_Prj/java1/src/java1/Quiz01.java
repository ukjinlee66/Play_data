package java1;
import java.util.Scanner;
public class Quiz01 
{

	public static void main(String[] args) 
	{
		System.out.println("Quiz1 초를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//초를 입력받아서 몇시간 몇분 몇초로 전환시키기.
		int hour = num/(60 * 60);
		int min = num/60 - (hour * 60);
		int sec = num%60;
		System.out.println(hour + "시 "+min+"분 "+sec+"초");
		System.out.println("Quiz2");
		for(int i=1;i<=100;i++)
			if ((i % 10) == 3 || (i % 10) == 6 || (i % 10) == 9)
				System.out.println("짝짝");
			else
				System.out.println(i);
		System.out.println("Quiz3 수를 입력하세요.");
		int y = sc.nextInt();
		sc.close();
		for(int i=0;i<y;i++)
		{
			for(int j=0;j<y;j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
