package service;

import member.Member;

//실제 기능을 만드는 곳
public class MemberService {
	
	//매개변수자리에 들어올 것은 member객체이다. 라고 선언
	public void register(Member member) {
		System.out.println("회원 등록을 시작합니다.");
		System.out.println("회원 이름 : "+member.getName());
		System.out.println("회원 나이 : "+member.getAge());
		System.out.println("회원 등록이 완료되었습니다.");
	}
	
	public void checkAdult(Member member) {
		if(member.Age>=20) {
			System.out.println("성인 회원입니다.");
		} else {
			System.out.println("청소년 회원입니다.");
		}
	}
}
