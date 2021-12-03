package java1;

public class for04 {

	public static void main(String[] args) 
	{
		int var=0;
		/*
		 * 1 ~ 10 합계출력.
		 * 시작점 :1
		 * 끝점 :10
		 * 스텝 :++
		 * 처리 :+=, print
		 */
		for(int i=1;i<11;i++)
			var+=i;
		System.out.println(var);
	}

}
