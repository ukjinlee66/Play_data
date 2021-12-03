package java1;

class TV23{
	void PowerOn() { System.out.println("TV PowerOn"); }
	void PowerOff() { System.out.println("TV PowerOff"); }
}
class LGTV23 extends TV23{
	@Override
	void PowerOn() { System.out.println("LGTV PowerOn"); }
	void PowerOff() { System.out.println("LGTV PowerOff"); }
}
class SSTV23 extends TV23{
	@Override
	void PowerOn() { System.out.println("SSTV PowerOn"); }
	void PowerOff() { System.out.println("SSTV PowerOff"); }
}
class HDTV23 extends TV23{
	@Override
	void PowerOn() { System.out.println("HDTV PowerOn"); }
	void PowerOff() { System.out.println("HDTV PowerOff"); }
}

public class Cla23 
{

	public static void main(String[] args) 
	{
//		LGTV23 tv1 = new LGTV23();
//		tv1.PowerOn();
//		tv1.PowerOff();
//		SSTV23 tv2 = new SSTV23();
//		tv2.PowerOn();
//		tv2.PowerOff();
//		HDTV23 tv3 = new HDTV23();
//		tv2.PowerOn();
//		tv2.PowerOff();
		
		TV23[] TVs = { new LGTV23(), new SSTV23(), new HDTV23()};
		for(TV23 tv : TVs)
		{
			tv.PowerOn();
			tv.PowerOff();
		}
	}

}
