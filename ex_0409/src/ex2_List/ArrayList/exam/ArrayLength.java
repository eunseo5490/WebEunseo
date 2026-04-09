package ex2_List.ArrayList.exam;

import java.util.ArrayList;
import java.util.List;

public class ArrayLength {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("Spring");
		list.add("HTML");
		list.add("CSS");
		
		List<Integer> lengths = new ArrayList<Integer>();
		
		for(int i=0; i<list.size(); i++ ) {
			lengths.add(list.get(i).length());
		}
		
		System.out.println(lengths);
		
		
		
		List<String> nameList = new ArrayList<String>();
		
		nameList.add("김철수");
		nameList.add("이영희");
		nameList.add("김철수");
		nameList.add("박민수");
		nameList.add("김철수");
		
		int count=0;
		
		for(int i=0; i<nameList.size(); i++) {
			if(nameList.get(i) == "김철수") {
				count++;
			}
		}
		System.out.println("김철수 "+count+"개");
		
		
		
		List<Integer> scores = new ArrayList<Integer>();
		
		scores.add(88);
		scores.add(72);
		scores.add(95);
		scores.add(60);
		scores.add(81);
		
		int max = scores.get(0);
		int min = scores.get(0);
		
		for(int i=0; i<scores.size(); i++) {
			if(scores.get(i)>max) {
				max = scores.get(i);
			}
			if(scores.get(i)<min) {
				min = scores.get(i);
			}
		}
		
		System.out.println("최고점수 : "+max);
		System.out.println("최소점수 : "+min);
		
		System.out.println(max-min);
		
		
		
		
	}
}
