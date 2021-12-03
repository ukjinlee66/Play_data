package java1;
import java.util.Random;

public class Math02 {

	public static void main(String[] args) {
		int num = (int) (Math.random()*6) + 1;
		System.out.println("�ֻ��� ��: " + num);
		
		Random random = new Random();
		System.out.println(random.nextInt(6)+1);
		System.out.println(random.nextInt(6)+1);
		System.out.println(random.nextInt(6)+1);
		System.out.println(random.nextInt(6)+1);

	}

}
