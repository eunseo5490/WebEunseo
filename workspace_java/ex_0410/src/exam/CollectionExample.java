package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExample {
	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>();
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("cherry");
		System.out.println(fruits);
		
		//문자열은 사전순으로 정렬이 된다.
		Collections.sort(fruits);
		System.out.println(fruits);
		
		//내림차순 정렬
		Collections.sort(fruits, Collections.reverseOrder());
		System.out.println(fruits);
		
		
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(30);
		numbers.add(10);
		numbers.add(20);
		System.out.println(numbers);
		
		//뒤집기
		Collections.reverse(numbers);
		System.out.println(numbers);
		
		
		
		List<Integer> numbers1 = new ArrayList<>();
		numbers1.add(1);
		numbers1.add(2);
		numbers1.add(3);
		numbers1.add(4);
		numbers1.add(5);
		numbers1.add(6);
		numbers1.add(7);
		numbers1.add(8);
		numbers1.add(9);
		System.out.println(numbers1);
		
		//섞기
		Collections.shuffle(numbers1);
		System.out.println(numbers1);

		//최대값, 최소값
		System.out.println("max : "+Collections.max(numbers1));
		System.out.println("min : "+Collections.min(numbers1));
		
		//문자열의 최대값은 사전순으로 뒤에있는 애
		System.out.println("max : "+Collections.max(fruits));

		
		
	}
}
