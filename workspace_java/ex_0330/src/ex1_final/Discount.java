package ex1_final;

public class Discount {
	
	static final double RATE_HIGH = 0.2;
	static final double RATE_MID = 0.1;
	static final double RATE_LOW = 0.05;
	
	
	public static double discountRate(int price) {
		if (price>=100000) {
			return RATE_HIGH;
		} else if(price>=50000) {
			return RATE_MID;
		} else {
			return RATE_LOW;
		}
	}
	
	public double calculatePrice(int price) {
		double rate = discountRate(price);
		return price * (1-rate);
	}
	
	
	
	
	


}
