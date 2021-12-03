package java1;
import java.util.*;
public class switch01 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		switch(str)
		{
			case "동" :		System.out.println("East");
				break;
			case "서" :		System.out.println("West");
				break;
			case "남" :		System.out.println("South");
				break;
			case "북" :		System.out.println("North");
				break;
			default : System.out.println("기타.");
		}
	}

}
