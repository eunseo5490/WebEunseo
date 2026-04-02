package ex1_innerclass.hiddnclass;


public class Home {
	//인터페이스의 객체는 직접 만들 수 없다.
	//인터페이스를 구현하는 클래스를 만들어 객체로 사용해야 한다.
	private REmoteControl rc = new REmoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	public void use2() {
		REmoteControl rc = new REmoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다.");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다.");
				
			}
		};
		
		rc.turnOn();
		rc.turnOff();
	}
	
	public void use3(REmoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}

}
