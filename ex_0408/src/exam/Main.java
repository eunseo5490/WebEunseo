package exam;

public class Main {
	public static void main(String[] args) {
		
		MemberResponse<Member> m1 = new MemberResponse<Member>(true, "회원 조회 성공",new Member("홍길동",27));
		
		
		
		
		
		
		
		
		System.out.println("성공여부 : "+m1.isSuccess());
		System.out.println("메시지 : "+m1.getMessage());
		System.out.println("이름 : "+m1.getData().getName());
		System.out.println("나이 : "+m1.getData().getAge()); 
		
		AnamailHospital<Dog> dogHospital = new AnamailHospital<Dog>(new Dog());
		AnamailHospital<Cat> catHospital = new AnamailHospital<Cat>(new Cat());
		
		//동물병원은 동물만 다루는 곳인데
		//문자열이나 숫자 다른 객체가 들어오면 이상해진다.
		dogHospital.treat();
		catHospital.treat();

	}
}
