package ex5_polymorphism.exam02;

public class Payment {
	public void pay(int amount) {
		System.out.println(amount+"원을 결제합니다.");
	}
	
}

class CardPayment extends Payment {
	@Override
	public void pay(int amount) {
		System.out.println("카드로 "+amount+"원을 결제합니다.");
	}

}

class KakaoPayment extends Payment {
	@Override
	public void pay(int amount) {
		System.out.println("카카오페이로 "+amount+"원을 결제합니다.");
	}
}

class Order {
	Payment payment;
	
	public void proccessPayment(int amount) {
		payment.pay(amount);
	}
	
}



