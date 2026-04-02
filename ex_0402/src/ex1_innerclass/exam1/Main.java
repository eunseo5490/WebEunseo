package ex1_innerclass.exam1;

public class Main {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl();
		RemoteControl.Button button = rc.new Button();
		
		button.press();
		System.out.println("현재 전원 상태 : "+rc.power);
	}
}
