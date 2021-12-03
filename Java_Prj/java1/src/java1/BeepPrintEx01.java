package java1;
import java.awt.Toolkit;

public class BeepPrintEx01 
{
	public static void main(String[] args) 
	{
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++)
		{
			//소리가 나오도록.
			toolkit.beep();
			try {Thread.sleep(1000);}
			catch(Exception e) {}
		}
		
		// 화면에 '띵' 메세지가 5번 출력되게 작성.
		for(int i=0;i<5;i++)
		{
			System.out.println("띵");
			try {Thread.sleep(1000);}
			catch(Exception e) {}
		}
	}

}
