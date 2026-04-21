package ex2_List.ArrayList.exam;

import java.util.ArrayList;
import java.util.List;

public class ArrayExam {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++) {
			int rand = (int)(Math.random()*30)+1;
			list.add(rand);
		}
		
		int total = 0;
		
		for(int x : list) {
			if(x%2 == 1) {
				total += x;
			}
		}
		
		int total2 = 0;
		
		for(int i=0; i<list.size(); i++ ) {
			if(list.get(i) %2 ==1) {
				total2 += list.get(i);
			}
		}
		
		System.out.println("총합 : "+total);
		System.out.println("총합 : "+total2);
		
		
		
		
		
	}
}
