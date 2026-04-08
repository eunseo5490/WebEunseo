package ex1_generic;

//타입 한정 키워드 : extends
//T extends 제한타입
//Number 클래스 : 숫자를 다루는 클래스들의 공통 부모 클래스
//하위 클래스 : Integer, Double, Long, Float 등
//T에는 Number 타입이거나 Number의 자식클래스만 해당된다.
public class Calculator<T extends Number> {
	void add(T a, T b) {}
	void min(T a, T b) {}
	void mul(T a, T b) {}
	void div(T a, T b) {}
}
