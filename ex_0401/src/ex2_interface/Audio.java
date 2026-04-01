package ex2_interface;

public class Audio implements RemoteControl {
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켠다.");
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
