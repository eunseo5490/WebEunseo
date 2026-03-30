package ex4_setter_getter;

public class User {
	
	private String username;
	private String password;
	private String email;
	
	
	public void setUsername(String username) {
		if(username.length()<4) {
			System.out.println("아이디는 4글자 이상이어야 합니다.");
		} else {
			this.username = username;
		}
	}
	public String getUsername() {
		return username;
		
	}
	
	
	public void setPassword(String password) {
		if(username.length()<6) {
			System.out.println("비밀번호는 6글자 이상이어야 합니다.");
		} else {
			this.password = password;
		}
	}
	public String getPassword() {
		return password;
		
	}
	
	
	public void setEmail(String email) {
		if(!email.contains("@")) {
			System.out.println("이메일 형식 오류");
		} else {
			this.email = email;
		}
	}
	public String getEmail() {
		return email;
		
	}
	
	
	public void userInfo() {
		System.out.println("아이디 : "+getUsername());
		System.out.println("비밀번호 : "+getPassword());
		System.out.println("이메일 : "+getEmail());
	}

}
