package ex1_innerclass.hiddnclass;

public class ButtonExample {
	public static void main(String[] args) {
		
		Button btnOk = new Button();
		
		btnOk.setClickListener(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("OK 클릭됨");
			}
			
		});
		
		Button btnCancel = new Button();
		
		btnCancel.setClickListener(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("Cancel 클릭됨");
			}
		});
		
		btnOk.click();
		btnCancel.click();
	}
}
