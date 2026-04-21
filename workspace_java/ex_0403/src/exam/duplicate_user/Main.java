package exam.duplicate_user;


public class Main {
	public static void main(String[] args) {
		Member m1 = new Member("eunseo", "박은서");
		Member m2 = new Member("eunseo", "은서");
		Member m3 = new Member("yeseo", "박은서");
		
		if(m1.equals(m2)) {
			System.out.println("일치");
		} else {
			System.out.println("불일치");
		}
		
		if(m1.equals(m3)) {
			System.out.println("일치");
		} else {
			System.out.println("불일치");
		}
		

		
		
	}
}
