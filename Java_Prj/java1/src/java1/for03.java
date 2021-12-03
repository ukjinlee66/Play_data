package java1;
import java.util.Scanner;
public class for03 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=50;i++) {
			if(i>25) break;
			if ((i%2)==1) continue;
			System.out.print(i+" ");
			
		}
	}

}
