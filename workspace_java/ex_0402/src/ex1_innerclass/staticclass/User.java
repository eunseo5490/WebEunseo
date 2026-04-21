package ex1_innerclass.staticclass;

//Builder 패턴
//객체를 만들 때 생성과정을 단계적으로 분리하는 설계 방식ㄷ
public class User {
	public User(Builder builder) {
		// TODO Auto-generated constructor stub
	}
	String id;
	String password;
	String name;
	String age;
	//단점 : 매개변수가 많아서 순서를 헷갈리기 쉽다.
	//어떤 값이 필수인지 한 눈에 보기 어렵다.
	//생성자가 너무 많이 오버로딩 될 수 있다.
	
	//객체 생성 책임 분리
	//Builder가 값을 하나씩 모으고
	//마지막에 build() 메서드를 통해서 실제 객체를 만드는 방식
	
	public static class Builder{
		private String id;
		private String password;
		private String name;
		private String age;
		
		public Builder id(String id) {
			this.id = id;
			return this; //현재 Builder 객체를 그대로 반환
		}
		public Builder password(String password) {
			this.password = password;
			return this;
		}
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		public Builder age(String age) {
			this.age = age;
			return this;
		}
		
		public User build() {
			//this -> Builder 객체
			return new User(this);
		}
	}

}
