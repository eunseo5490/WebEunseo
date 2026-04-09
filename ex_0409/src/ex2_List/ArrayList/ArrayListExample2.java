package ex2_List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {
	public static void main(String[] args) {
		/*
		List<String> names = new ArrayList<String>();
		List<Integer> ages = new ArrayList<Integer>();
		
		names.add("홍길동");
		ages.add(30);
		*/
		
		List<Member> members = new ArrayList<>();
		
		members.add(new Member());
		members.add(new Member());
		members.add(new Member());
		
		members.get(0).setName("홍길동");
		members.get(0).setAge(30);
		members.get(1).setName("박민수");
		members.get(1).setAge(40);
		members.get(2).setName("김철수");
		members.get(2).setAge(25);
		
		System.out.println(members);
		
		System.out.println(members.get(0).getName());
		System.out.println(members.get(0).getAge());
		
		System.out.println(members.get(1).getName());
		System.out.println(members.get(1).getAge());

		System.out.println(members.get(0).getName());
		System.out.println(members.get(0).getAge());
		
		
	}
}
