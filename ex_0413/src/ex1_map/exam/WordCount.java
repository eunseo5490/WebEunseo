package ex1_map.exam;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WordCount {
	public static void main(String[] args) {
		//단어 빈도수 분석기
		
		String text = "Apple banana apple Banana apple";
		String[] words = text.toLowerCase().split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String word : words) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			} else {
				map.put(word, 1);
			}
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		
		
		
		
		
		
	}
}
