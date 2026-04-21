package ex1_innerclass.hiddnclass;

public class Button {

	public static interface ClickListener {
		void onClick();
	}
	
	private ClickListener clickListener;
	
	//setter
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		clickListener.onClick();
	}
	
	
	
	
	//void click();
	//전달받은 객체가 가지는 onClick() 메서드 호출하기
	


	
}



