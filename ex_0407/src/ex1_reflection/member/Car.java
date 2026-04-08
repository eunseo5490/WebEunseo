package ex1_reflection.member;

public class Car {
	//필드
	//- 모델
	//- 오너
	private String model;
	private String owner;
	
	//기본생성자
	public Car() {}
	
	//모델만 초기화하는 생성자
	public Car(String model) {
		this.model = model;
	}
	
	//setter&getter
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel(String model) {
		return model;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwner(String owner) {
		return owner;
	}
	
}
