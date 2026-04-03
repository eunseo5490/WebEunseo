package ex2_object;

public class EqualsExample {
	public static void main(String[] args) {
		Member obj1 = new Member("red");
		Member obj2 = new Member("red");
		Member obj3 = new Member("blue");
		
		if(obj1.equals(obj2)) {
			System.out.println("일치");
		} else {
			System.out.println("불일치");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("일치");
		} else {
			System.out.println("불일치");
		}

	}
}
