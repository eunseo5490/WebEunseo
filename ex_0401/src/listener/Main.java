package listener;

public class Main {
	public static void main(String[] args) {
		Button login = new Button();
		Button logout = new Button();
		
		login.setListener(new LoginListener());
		login.click();
		
		logout.setListener(new LogoutListener());
		logout.click();
		
	}
}
