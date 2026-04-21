package transport;

public class Main {
	public static void main(String[] args) {
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		TransPort[] t = {new Bus(), new Taxi()};
		
		t[1].name = "버스";
		t[1].baseFare = 1200;
		
		t[2].name = "택시";
		t[2].baseFare = 3000;
		t[2].distance = 10;
		t[2].farePerKm = 100;
		
		
	}
}
