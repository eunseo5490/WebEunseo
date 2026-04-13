package ex1_map.exam;

import java.util.HashMap;
import java.util.Map;

public class StudentAvg {
	public static void main(String[] args) {
		Map<String, Integer> std = new HashMap<String, Integer>();
		
		std.put("홍길동", 10);
		std.put("김철수", 20);
		std.put("박민수", 30);
		
		
		int total = 0;
		String topStudent = null;
		int topScore = 0;
		
		for(Map.Entry<String, Integer> entry : std.entrySet()) {
			total += entry.getValue();
			if(entry.getValue()>topScore) {
				topStudent = entry.getKey();
				topScore = entry.getValue();
			}
		}
		
		System.out.println("평균점수 : "+(double)total / std.size()+"점");
		System.out.println("최고 점수 학생 : "+topStudent+"/"+topScore+"점");
		
		
		
		
		
	}
}
