package main;

import dao.MemberDAO;
import dto.MemberDTO;

public class Main {
	public static void main(String[] args) {
		//member 테이블의 모든 내용 조회하기
		MemberDAO dao = new MemberDAO();
		
		dao.findAll();
		
		//dao.insertMember(new MemberDTO("박민수", "park@test.com", 40));
		
		dao.updateMember(4, 45);
		
		dao.deleteMember(4);
		
	}
}	
