package throwsexample;

public class TrowsExample {
	
	public static void main(String[] args) {
		try {
			findClass();
		} catch (Exception e) {
			System.out.println("예외 처리 : "+e.toString());
		}
	}
	
	//나열해야 하는 예외 클래스 많은 경우 throws Exception 또는 throws Throwablea만으로 모든 에외를 간단히 넘길 수도 있다.
	public static void findClass() throws ClassNotFoundException {
		//java.lang.String2 클래스를 찾아서 메모리에 올리는 기능
		Class.forName("java.lang.String2");
	}
}
