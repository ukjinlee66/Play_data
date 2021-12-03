package java1;
import java.util.Scanner;
public class for05 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("행입력 : ");
		int val = sc.nextInt();
		System.out.print("열입력 : ");
		int val2 = sc.nextInt();
		for(int i=1;i<=val;i++)
		{
			for(int j=1;j<=val2;j++)
				System.out.print(i*j+" ");
			System.out.println("");
		}
		sc.close();
	}

}
