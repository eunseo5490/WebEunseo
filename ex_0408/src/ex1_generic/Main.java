package ex1_generic;

public class Main {
	public static void main(String[] args) {
		Calculator<Number> call = new Calculator<Number>();
		Calculator<Integer> cal2 = new Calculator<Integer>();
		Calculator<Double> cal3 = new Calculator<Double>();
		Calculator<Float> cal4 = new Calculator<Float>();
		
		//제네릭에 넣을 수 있는 타입의 범위를 한정
		
		//1. 잘못된 타입을 미리 막을 수 있다.
		//2. 상위 타입의 기능을 사용할 수 있다.
		
		DeviceManager<Tv> tvManager = new DeviceManager<Tv>(new Tv());
		DeviceManager<Audio> audioManager = new DeviceManager<Audio>(new Audio());
		
		tvManager.powerOn();
		audioManager.powerOn();
		
		
		//Readable과 Cloneable을 동시에 구현한 클래스만이 타입 할당 가능
		Box<BoxType> box = new Box<>();
		//Box<Object> box2 = new Box<>(); //X
	}
}
