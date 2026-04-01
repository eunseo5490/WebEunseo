package notificate;

public class EmailNotification implements Notification{

	@Override
	public void send(String message) {
		System.out.println("[EMAIL] "+message+"을 환영합니다.");
		
	}

}
