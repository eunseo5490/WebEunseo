package ex1_lambda.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		List<Member> mem = new ArrayList<Member>();
		
		mem.add(new Member("홍길동", 20));
		mem.add(new Member("박길동", 18));
		mem.add(new Member("이길동", 40));
		mem.add(new Member("김길동", 27));
		
		Predicate<Member> adult = m -> m.age >=20;
		
		for(Member m : mem) {
			if(adult.test(m)) {
				System.out.println(m.name+" / "+m.age);
			}
		}
	}
}
