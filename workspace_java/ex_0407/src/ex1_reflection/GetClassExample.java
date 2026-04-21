package ex1_reflection;

public class GetClassExample {
	public static void main(String[] args) throws Exception {
		
		//Class 클래스
		//클래스의 정보 자체를 담고 있는 클래스
		
		
		//방법1
		Class clazz1 = Car.class;
		
		//방법2
		//경로에 클래스가 없을 경우가 있기 때문에
		//ClassNotFoundException 예외가 발생할 수 있는 코드가 됨
		//따라서 메인 메서드에 throws Exception 작성해줘야 함
		Class clazz2 = Class.forName("ex1_reflection.Car");
		
		//방법3
		//객체를 만들고 getClass() 메서드를 통해서 정보를 얻어온다.
		Car car = new Car();
		Class clazz3 = car.getClass();
		
		
		//getPackage() : 패키지 정보 읽기
		System.out.println("패키지명 : "+clazz1.getPackage().getName());
		
		//getSimpleName() : 클래스명(패키지명 미포함)
		System.out.println("클래스명(간단) : "+clazz1.getSimpleName());
		
		//getName() : 클래스명
		System.out.println("클래스명(간단) : "+clazz1.getName());
		
		
		
		
	}
}
