package examples.userinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		List<UserInfo> users = new ArrayList<>();
		
		users.add(new UserInfo());
		users.add(new UserInfo());
		users.add(new UserInfo());
		
		for(int i=0; i<3; i++) {
			
			System.out.print("아이디 : ");
			users.get(i).setID(sc.nextLine());
			System.out.print("비밀번호 : ");
			users.get(i).setPW(sc.nextInt());
			
			System.out.println("");
			
			System.out.println(users.get(i).getID());
			System.out.println(users.get(i).getPW());
			
			System.out.println("------------");
			
			users.get(i).setID(sc.nextLine());
		}
		
		for(int i=0; i<users.size(); i++) {
			System.out.println(users.get(i).getID());
			System.out.println(users.get(i).getPW());
			
			System.out.println("------------");
		}
		

		
		
	}
}
