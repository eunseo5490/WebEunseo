package transport;

public abstract class TransPort {
	
	String name;
	int baseFare;
	int distance;
	int farePerKm;
	
	public void showName() {
		
	}
	
	public void printFare(int distance) {
		
	}
	
	public abstract int calculatorFare();

}
