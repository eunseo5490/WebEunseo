package ex5_singleton;

public class SingletonExample {
	public static void main(String[] args) {
		
		
		//Singleton obj = new Singleton();
		//생성자가 private으로 정의되어있기 때문에
		// 다른 클래스에서 호출 불가능
		
		
		//Singleton 클래스에서 만들어놨던 객체를 받아온 것
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		//obj1과 obj2가 같은 객체인지 증명하기
		if(obj1.getInstance()==obj2.getInstance()) {
			System.out.println("같은 객체");
		} else {
			System.out.println("같지 않은 객체");
		}
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		
		
	}
}
