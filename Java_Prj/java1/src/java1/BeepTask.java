package java1;

import java.awt.Toolkit;

public class BeepTask implements Runnable 
{
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
}
