package ex2_object;

public class Member {
	
	String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	
	//instanceof 연산자 : 왼쪽에 있는 객체가 오른쪽의 타입인지 검사
	//일치하면 target 변수에 담는다.
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			if(id.equals(target.id)) { //id랑 문자열이 같은지 비교
				return true;
			}
		}
		return false;
	}
	
	
	
}
