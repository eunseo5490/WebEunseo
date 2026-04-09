package ex2_List.ArrayList.linkedList;

import java.util.LinkedList;
import java.util.List;

//내부 구조 : 이중 연결 리스트
//장점 : 삽입/
//단점 : 

public class LinkedListExample {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		list.add(1,90); //중간 삽입
		System.out.println(list);
	}
}
