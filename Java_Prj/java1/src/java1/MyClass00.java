package java1;

public class MyClass00 
{
	RemoteControl rc = new Television();
	
	MyClass00( RemoteControl rc)
	{
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	void methodA()
	{
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	void methodB(RemoteControl rc)
	{
		rc.turnOn();
		rc.setVolume(5);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyClass00 my = new MyClass00(new Audio());
		
	}

}
