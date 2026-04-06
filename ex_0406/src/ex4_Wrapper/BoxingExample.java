package ex4_Wrapper;

public class BoxingExample {
	public static void main(String[] args) {
		
		//박싱
		Integer obj = 100;
		System.out.println(obj+100);
		System.out.println(obj.intValue());
		
		//언박싱
		int result = obj;
		System.out.println(result);
	}
}
