package java1;
import java.awt.Toolkit;

public class BeepPrintEx02 
{
	public static void main(String[] args) 
	{
		//Thread 클래스 < -- 익명 구현 객체 로 구성
		// run() method 구성
		// start() 로 또 하나의 Thread를 실행.
		
		Thread thread = new Thread() {
			public void run()
			{
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++)
				{
					//소리가 나오도록.
					toolkit.beep();
					try {Thread.sleep(1000);}
					catch(Exception e) {}
				}
			}
			public void start()
			{
				
			}
		};
		thread.run();
		
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		for(int i=0;i<5;i++)
//		{
//			//소리가 나오도록.
//			toolkit.beep();
//			try {Thread.sleep(1000);}
//			catch(Exception e) {}
//		}
//		
//		// 화면에 '띵' 메세지가 5번 출력되게 작성.
//		for(int i=0;i<5;i++)
//		{
//			System.out.println("띵");
//			try {Thread.sleep(1000);}
//			catch(Exception e) {}
//		}
	}

}
