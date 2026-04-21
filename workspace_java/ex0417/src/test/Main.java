package test;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		ArrayList<Member> m = new ArrayList<>();
		
		m.add(new Member("lee", "이영희", 10));
		m.add(new Member("hong", "홍길동", 20));
		m.add(new Member("park", "박민수", 30));
		
		int adultMember = 0;
		
		for(int i=0; i<m.size(); i++) {
			m.get(i).printInfo();
			if(m.get(i).getAge() >=20) {
				adultMember ++;
			}
		}
		
		System.out.println("성인 회원 수 : "+adultMember+"명");
		
		
	}
}
