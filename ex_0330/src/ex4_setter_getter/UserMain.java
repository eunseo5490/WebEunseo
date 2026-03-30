package ex4_setter_getter;

import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user1 = new User();
		
		
		System.out.print("아이디를 입력해주세요.\n> ");
		user1.setUsername(sc.nextLine());
		
		System.out.print("비밀번호를 입력해주세요.\n> ");
		user1.setPassword(sc.nextLine());

		System.out.print("이메일을 입력해주세요.\n> ");
		user1.setEmail(sc.nextLine());
		
		
		System.out.println("[ 사용자 정보 ]");

		user1.userInfo();
		
		
	}

}
