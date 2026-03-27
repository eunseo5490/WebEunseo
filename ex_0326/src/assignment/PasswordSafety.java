package assignment;

import java.util.Scanner;

public class PasswordSafety {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이메일을 입력해주세요.\n> ");
		String email = sc.nextLine();

		String[] parts = email.split("@");

		String id = parts[0];
		String domain = parts[1];

		System.out.println("\n[ 사용자 정보 ]");
		System.out.println("아이디: " + id);
		System.out.println("도메인: " + domain);
	}

}
