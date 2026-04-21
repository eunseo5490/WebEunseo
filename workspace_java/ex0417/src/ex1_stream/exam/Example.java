package ex1_stream.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3,5,7,8,10,4,1,2,6,9,1,1,1,3,3,3);
		
		//짝수만 골라 10을 더한 뒤 출력
		numbers.stream()
		.filter(x->x%2==0)
		.map(x->x+10)
		.forEach(x->System.out.print(x+" "));
		
		
		//문자열의 길이가 5 이상인 문자열만 남긴 뒤 대문자로 변환하여 출력
		List<String> words = Arrays.asList("java", "spring", "react", "db", "server");
		words.stream()
		.filter(x->x.length() >=5)
		.map(String::toUpperCase)
		.forEach(x->System.out.print(x+" "));
		
		
		
		List<Integer> orders = Arrays.asList(12000, 80000, 45000, 50000, 99000, 30000);
		
		long count = orders.stream()
		.filter(x->x>=50000)
		.count();
		
		System.out.println(count);
		
		
		List<Integer> ages = Arrays.asList(21, 35, 17, 42, 63, 15);
		
		boolean result1 = ages.stream()
				.anyMatch(x->x<20);
		boolean result2 = ages.stream()
				.allMatch(x->x>=20);
		boolean result3 = ages.stream()
				.noneMatch(x->x<100);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
		List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		int sum = numbers2.stream()
			    .filter(x -> x % 2 == 0)
			    .map(x -> x * x)
			    .reduce(0, Integer::sum);
		
		System.out.println(sum);
		
		
		List<Integer> scores = Arrays.asList(55, 90, 82, 67, 99, 80, 73);
		System.out.println(scores);
		
		scores = scores.stream()
		.filter(x->x>=80)
		.sorted((a,b)->b-a)
		.collect(Collectors.toList());
		System.out.println(scores);
		
        List<Product> p = Arrays.asList(
                new Product("마우스", 8000),
                new Product("키보드", 30000),
                new Product("모니터", 150000),
                new Product("노트", 2000)
            );
        
        

		Map<String, Integer> m = new HashMap<>();
		
		
		
	}
	
	static class Product {
	    String name;
	    int price;

	    public Product(String name, int price) {
	        this.name = name;
	        this.price = price;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getPrice() {
	        return price;
	    }
	}
}
