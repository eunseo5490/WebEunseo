package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bingo {
	public static void main(String[] args) {
		//1~50사이의 난수가 있다.
		//5x5의 빙고판에 25의 숫자를 채운다.
		//중복 안됨
		
		//만약 숫자가 오름차순으로 연속되게 나오면 섞어주기
		
		List<Integer> numbers = new ArrayList<>();

		for(int i=1; i<=50; i++) {
		    numbers.add(i);
		}

		Collections.shuffle(numbers);

		// 앞에서 25개만 사용
		List<Integer> bingo = numbers.subList(0, 25);

		System.out.println(bingo);
		
		
		
	}
}
