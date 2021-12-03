package java1;

public class Television implements RemoteControl 
{
	private int volume;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TVon");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TVoff");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume>RemoteControl.MAX_VOLUME)
			this.volume = RemoteControl.MAX_VOLUME;
		else if (volume<RemoteControl.MIN_VOLUME)
			this.volume = RemoteControl.MIN_VOLUME;
		else
			this.volume = volume;
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}

}
