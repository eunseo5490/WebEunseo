package ex1_innerclass.exam1;

public class RemoteControl {
	String power = "Off";
	
	class Button {
		void press() {
			power = "On";
			System.out.println("전원을 켭니다.");
		}
	}
}
