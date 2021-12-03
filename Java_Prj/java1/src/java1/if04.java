package java1;
import java.util.Scanner;
public class if04 
{
	public static void main(String[] args) 
	{
		int iEn = 90;
		int iKr = 90;
		int iTotal,iAvg;
		iTotal = iEn + iKr;
		iAvg = iTotal / 2;
		if (iAvg >= 90)
			System.out.println("우수 ");
		else if (iAvg >= 80)
			System.out.println("보통 ");
		else if (iAvg >= 70)
			System.out.println("부족 ");
		else
			System.out.println("낙제 ");
	}

}
