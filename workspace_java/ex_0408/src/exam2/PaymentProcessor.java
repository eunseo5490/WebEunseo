package exam2;

public class PaymentProcessor<T extends Payment> {
	T payment;
	
	public PaymentProcessor(T payment) {
		this.payment = payment;
	}
	
	public void process() {
		payment.pay();
	}
}
