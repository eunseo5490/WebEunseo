package ex1_map.exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<String, String> users = new HashMap<String, String>();
		
	    users.put("admin", "1234");
        users.put("user1", "abcd");
        users.put("guest", "1111");
		
        System.out.println("아이디를 입력해주세요.");
        System.out.print("> ");
		String id = sc.nextLine();
		
		for(Map.Entry<String, String> entry : users.entrySet()) {
			if(!id.equals(entry.getKey())) {
				System.out.println("\n[ 아이디가 존재하지 않습니다. ]");
				break;
			}
			
			System.out.println();
			
	        System.out.println("비밀번호를 입력해주세요.");
	        System.out.print("> ");
			String pw = sc.nextLine();
			
			if(pw.equals(entry.getValue())) {
				System.out.println("\n[ 로그인 성공 ]");
				break;
			} else {
				System.out.println("\n[ 비밀번호 오류입니다. ]");
				break;
			}
		}
		
		
	}
}
