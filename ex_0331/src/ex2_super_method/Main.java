package ex2_super_method;

public class Main {
	public static void main(String[] args) {
		SuperSonicAirplane sonic = new SuperSonicAirplane();
		
		sonic.takeOff();
		sonic.fly();
		
		sonic.flyMode = SuperSonicAirplane.SUPERSONIC;
		
		sonic.fly();
		
		sonic.flyMode =  SuperSonicAirplane.NORMAL;
		
		sonic.fly();
		sonic.land();
		
		
	}
}
