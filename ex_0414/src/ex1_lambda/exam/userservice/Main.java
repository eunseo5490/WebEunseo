package ex1_lambda.exam.userservice;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<User> users = new ArrayList<User>();
		users.add(new User("김철수", 25, "서울"));
		users.add(new User("이영희", 18, "인천"));
		users.add(new User("김민수", 30, "부산"));
		users.add(new User("박지은", 22, "서울"));
        
        UserService service = new UserService();
        
        System.out.println("성인 회원");
        service.filterUsers(users, service.getFilter("adult"));
        
        System.out.println();
        
        System.out.println("서울 회원");
        service.filterUsers(users, service.getFilter("seoul"));
        
        System.out.println();
        
        System.out.println("김씨 회원");
        service.filterUsers(users, service.getFilter("kim"));
	}
}
