package ex3_overloading;

public class Perseon {
	
	String name;
	int age;
	
	public Perseon(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void introduce() {
		System.out.printf("안녕하세요. 저는 %d살 %s입니다.", age, name);
	}

}
