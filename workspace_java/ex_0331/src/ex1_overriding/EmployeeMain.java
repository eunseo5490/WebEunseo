package ex1_overriding;

public class EmployeeMain {
	public static void main(String[] args) {
        RegularEmployee regular = new RegularEmployee("김철수", 3000000);
        PartTimeEmployee partTime = new PartTimeEmployee("이영희", 50000, 80);

        System.out.println("정규직 "+regular.name+"의 급여 : "+regular.getPay());
        System.out.println("알바 "+partTime.name+"의 급여 : "+partTime.getPay());
		
	}
}
