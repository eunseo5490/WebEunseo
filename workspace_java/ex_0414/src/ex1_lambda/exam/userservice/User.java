package ex1_lambda.exam.userservice;

public class User {
	
	private String name;
	private int age;
	private String city;
	
	public User(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getCity() {
		return city;
	}
	
    @Override
    public String toString() {
        return "이름: " + name + ", 나이: " + age + ", 지역: " + city;
    }
}
