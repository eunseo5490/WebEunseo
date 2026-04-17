package ex1_stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		//스트림을 사용하기 위해서는 스트림 객체를 생성해야 한다!
		
		//Collection 인터페이스에 stream() 메서드가 존쟇나다.
		
		//컬렉션에서 생성하는 방법
		List<String> list = Arrays.asList("A","B","C");
		Stream<String> stream = list.stream();
		
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
		Stream<Integer> setStream = set.stream();
		
		//Map은 Collection 인터ㅓ페이스가 ㅇ ㅏ니다.
		//그렇기 때문에 stream() 메서드가 존재하지는 않는다.
		
		//keySet()
		//key만 스트림으로 만들고 싶을 때 사용
		Map<String, Integer> map = new HashMap<>();
		map.put("사과", 1000);
		map.put("바나나", 2000);
		
		map.keySet().stream();
		
		//values()
		//값만 스트림으로 만들고 싶을 때 사용한다.
		map.values().stream();
		
		//entrySet()
		//키와 값을 둘 다 써야될 때 사용한다.
	}
}
