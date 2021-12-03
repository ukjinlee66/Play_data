package java1;
import java.util.Scanner;
public class if02 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력=> ");
		int var = sc.nextInt();
		sc.close();
		if (var >= 90)
			System.out.println("우수 ");
		else if (var >= 80)
			System.out.println("보통 ");
		else if (var >= 70)
			System.out.println("부족 ");
		else
			System.out.println("낙제 ");
	}

}
