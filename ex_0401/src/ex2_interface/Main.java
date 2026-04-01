package ex2_interface;

public class Main {
	public static void main(String[] args) {
		//인터페이스도 하나의 타입이기 때문에 변수의 타입으로 사용할 수 있다.
		RemoteControl rc = new Television();
		rc.turnOn();
		
		Television tv = new Television();
		
		//rc변수에 Audio객체로 교체할 수 있다.
		rc = new Audio();
		rc.turnOn();
		
		//인터페이스의 객체를 생성할 수도 없다.
		//상수는 그냥 호출해서 쓸 수 있다.
		//구현 객체와 관련 없는 인터페이스 소속 멤버이므로 인터페이스로 접근해서 사용 가능
		System.out.println("리모컨 최대 볼륨 : "+RemoteControl.MAX_VOLUME);
		System.out.println("리모컨 최소 볼륨 : "+RemoteControl.MIN_VOLUME);
		
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		
		RemoteControl.changeBattery();
		
		rc = new SmartTelevision();
		
		rc.turnOn();
		
		//rc.search("https");
		//해당 인터페이스에서 구현한 메서드만 사용 가능
		
		Searchable search = new SmartTelevision();
		search.search("https");
		
		SmartTelevision st = new SmartTelevision();
		st.turnOn();
		st.search("https://www.youtube.com");
		
		
	}
}
