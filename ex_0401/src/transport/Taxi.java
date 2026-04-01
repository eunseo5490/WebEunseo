package transport;

public class Taxi extends TransPort {
	
	int distance; //거리
	int farePerKm; //km당 요금
	
	@Override
	public int calculatorFare() {
		return distance*farePerKm;
	}
	
}
