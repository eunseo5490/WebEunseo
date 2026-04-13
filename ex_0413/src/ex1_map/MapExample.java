package ex1_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Map은 키와 값을 한 쌍으로 저장하는 자료구조
//키(Key) : 값(Value)을 찾기 위한 이름표 역할

//키 - 중복 불가능
//값 - 중복 가능
public class MapExample {
	public static void main(String[] args) {
		//Map은 Key와 Value의 제네릭 타입을 각각 설정해야 한다.
		//Map<K, V>
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		//map에 데이터를 저장하는 방법
		//put(K k, V v);
		m.put("사과", 1000);
		m.put("바나나", 2000);
		m.put("포도", 3000);
		
		//내가 넣은 데이터 순으로 출력을 보장하지 않음
		System.out.println(m);
		
		//저장한 데이터를 꺼내는 방법
		//get(key)
		System.out.println(m.get("사과"));
		
		//없는 key를 조회하려고 하면 null값이 나옴
		System.out.println(m.get("딸기"));
		
		//Key가 중복되면 덮어씌운다.
		m.put("사과", 1500);
		System.out.println(m.get("사과"));
		
		
		//데이터 삭제하기
		//remove(key)
		System.out.println(m.remove("사과")); //value 값을 반환한 뒤 삭제
		System.out.println(m);
		
		//key의 존재여부 확인하기
		//containsKey(key)
		
		if(m.containsKey("포도")) {
			System.out.println("포도 존재");
		}
		
		//value의 존재여부 확인하기
		//containsValue(value)
		if(m.containsValue(1500)) {
			System.out.println("1500원짜리 존재");
		}
		
		//map에 들어있는 데이터의 개수 확인
		//size()
		System.out.println("map의 크기 : "+m.size());
		
		//컬렉션이 비어있는지 확인
		//isEmpty()
		System.out.println("map에 데이터이 있는지 확인 : "+m.isEmpty());
		
		
		//Map에서 전체 데이터를 다루는 방법
		
		//map에 들어있는 모든 key를 Set으로 반환
		//keySet()
		
		Set<String> set = m.keySet();
		for(String s : set) {
			System.out.println(s);
		}
		
		//key-value 쌍 전체를 Set<Entry<K,V>> 형태로 반환
		Set<Map.Entry<String, Integer>> set2 = m.entrySet();
		
		for(Map.Entry<String, Integer> entry : set2) {
			System.out.println(entry.getKey() + " : "+ entry.getValue());
		}
		
		Map<Integer,Character> m2 = new HashMap<Integer,Character>();
		m2.put(1004, 'C');
		m2.put(45, 'A');
		m2.put(29, 'D');
		
		//key가 존재하면 value를 반환하고, 없으면 기본값(default)을 반환하는 메서드
		//getOrDefault(Object key, V defaultValue);
		
		//get() 했을 때 key가 없으면 null을 반환
		System.out.println(m.getOrDefault("사과", 1500));
		
		
		
		
		
		
		
		
		
	}
}
