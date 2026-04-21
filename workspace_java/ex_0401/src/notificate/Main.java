package notificate;

public class Main {
	public static void main(String[] args) {
		Notification[] m = {new SmsNotification(), new EmailNotification()};
		
		for(Notification message : m) {
			message.send("안녕하세요");
			
		}
	}
}
