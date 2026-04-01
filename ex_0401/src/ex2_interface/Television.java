package ex2_interface;

public class Television implements RemoteControl {
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("텔레비전을 켠다.");
	}
	
	@Override
	public void setVolume (int volume) {
		if(volume>MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if (volume<MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
	}

}
