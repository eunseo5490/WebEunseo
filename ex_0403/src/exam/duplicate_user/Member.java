package exam.duplicate_user;

public class Member {
	
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

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
