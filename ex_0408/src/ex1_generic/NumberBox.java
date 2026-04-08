package ex1_generic;

//T는 최소한 Number 타입의 기능을 가지고 있다고 보장
public class NumberBox <T extends Number> {
	
	private T value;
	
	public NumberBox(T value) {
		this.value = value;
	}
	
	//doubleValue() : 숫자 객체에 들어있는 값을 double형으로 꺼내는 메서드
	//T가 아무타입이나 받게 된다면 이 메서드를 사용할 수 없다.
	//T의 타입을 한정했기 때문에 컴파일러가 T는 적어도 Number 계열이라는 것을 안다.
	public double toDouble() {
		return value.doubleValue();
	}
	
}
