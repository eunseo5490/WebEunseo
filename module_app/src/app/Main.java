package app;

import service.MemberService;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("회원의 이름을 입력해주세요.");
		System.out.print("> ");
		String name = sc.nextLine();
		
		System.out.println("회원의 나이를 입력해주세요.");
		System.out.print("> ");
		int age = sc.nextInt();
		
		Member user = new Member(name, age);
		
		user.register();
		
		
	}
}
