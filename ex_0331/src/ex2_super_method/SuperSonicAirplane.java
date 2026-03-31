package ex2_super_method;

public class SuperSonicAirplane extends AirPlane {
	final static int NORMAL = 1;
	final static int SUPERSONIC = 2;
	
	int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("초음속 비행을 합니다.");
		} else {
			AirPlane a = new AirPlane();
			a.fly();
		}
	}
	
	
	
	
	
}
