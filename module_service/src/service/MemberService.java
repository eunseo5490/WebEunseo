package service;

import member.Member;

public class MemberService {
	
	Member member;
	public void register(Member member) {
		System.out.println("회원 등록을 시작합니다.");
		System.out.println("회원 이름 : ");
		System.out.println("회원 나이 : ");
		System.out.println("회원 등록이 완료되었습니다.");
	}
}
