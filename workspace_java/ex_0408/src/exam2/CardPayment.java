package exam2;

public class CardPayment implements Payment{

	@Override
	public void pay() {
		System.out.println("신용/체크카드로 결제합니다.");
		
	}

}
