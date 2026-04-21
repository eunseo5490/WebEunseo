package exam.cal;

public class OrderService {
	
	
	public int total(int price, int amount) throws IllegalArgumentException{
		if(price < 0) {
			throw new IllegalArgumentException("가격은 1 이상이어야 합니다.");
		}
		
		if(amount <= 0) {
			throw new IllegalArgumentException("수량은 1 이상이어야 합니다.");
		}
		
		return price*amount;
	}
}
