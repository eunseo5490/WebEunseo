package ex4_setter_getter;

public class StudentMain {
	public static void main(String[] args) {
		//객체를 만들어야 함
		//객체의 변수명 : 클래스명 변수명 = 
		//객체의 선언 : new 클래스명();
		Student s = new Student();
		
		s.setName("박은서");
		s.setAge(-1);
		
		System.out.println("이름 : "+s.getName());
		System.out.println("나이 : "+s.getAge());
		
	}

}
