package test;

public class Main {
	public static void main(String[] args) {
		
		//방법1 (거의 안쓰임)
		//Person p = new Person();
		//p.name = "박은서";
		//p.age = 30;
		
		//방법2
		//Person p2 = new Person("박은서", 20);
		
		//방법3
		Person p3 = new Person();
		
		p3.setName("박은서");
		p3.setAge(20);
	}
}
