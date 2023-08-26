package section11.access2;

public class RemoteControl {
	private int volume = 20;
	private int channel = 0;
	
	public void volumeUp() {
		volume += 1;
	}
	
	public void volumeDown() {
		volume -= 1;
	}
	
	public void channelUp() {
		volume += 1;
	}
	
	public void channelDown() {
		volume -= 1;
	}
	
	public void getInfo() {
		System.out.println("volume: " + volume);
		System.out.println("channel: " + channel);
	}
}
