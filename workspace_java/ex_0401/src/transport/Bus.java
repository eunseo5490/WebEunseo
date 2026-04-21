package transport;

public class Bus extends TransPort {
	
	int baseFare;

	@Override
	public int calculatorFare() {
		return baseFare;
	}
	
}
