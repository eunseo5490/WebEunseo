package ex1_map.exam;

import java.util.HashMap;
import java.util.Map;

public class MaxFinder {
	public static void main(String[] args) {
		int [] arr = {1,3,2,3,4,3,2,2,2};
		
		Map<Integer, Integer> number = new HashMap<Integer, Integer>();
		
		for(int n : arr) {
			if(number.containsKey(n)) {
				number.put(n, number.get(n)+1);
			} else {
				number.put(n, 1);
			}
		}
		
		int maxNumber = 0;
		int frequency = 0;
		
		for(Map.Entry<Integer, Integer> entry : number.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue()+"개");
			if(entry.getValue()>frequency) {
				maxNumber = entry.getKey();
				frequency = entry.getValue();
			}
		}
		
		System.out.println();
		System.out.println("가장 많이 등장한 숫자 : "+maxNumber);
		System.out.println(maxNumber+"의 등장 횟수 : "+frequency);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
