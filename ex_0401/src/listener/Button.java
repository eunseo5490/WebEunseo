package listener;

public class Button {
	
	ClickListener l;
	
	public void setListener(ClickListener listener) {
		this.l = listener;
	}
	
	public void click() {
		l.onClick();
	}
}
