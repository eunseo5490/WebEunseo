package test;

public class Member {
	String id;
	String name;
	int age;
	
	public Member(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.printf("아이디: %s, 이름: %s, 나이: %d\n", id, name, age);
	}
	
	public String getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
