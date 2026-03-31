package ex5_polymorphism.exam02;

public class OrderMain {
	public static void main(String[] args) {
		
		Order order = new Order();
		
		order.payment = new CardPayment();
		order.proccessPayment(200);
		
		order.payment = new KakaoPayment();
		order.proccessPayment(300);
		
		
		
		
		
		
	}
}


