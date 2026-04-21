package ex1_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;


public class Example {
	public static void main(String[] args) {
		
		//요소의 변환
		//map(Function<T,R>)
		List<String> sList = List.of("java","spring", "react");
		
		sList.stream().map(String::toUpperCase).forEach(System.out::println);
		
		
		//mapToInt()
		//객체 스트림을 IntStream으로 변환한다.
		List<String> list2 = List.of("a","bb","ccc");
		
		list2.stream()
		.mapToInt(String::length)
		.forEach(System.out::println);
		
		
		//정렬계열
		//sorted()
		int[] arr = {5,2,9,1,7};
		
		//오름차순 정렬
		Arrays.stream(arr)
		.sorted()
		.forEach(System.out::println);
		
		//내림차순 정렬
		Arrays.stream(arr)
		.boxed() //기본형 스트림을 객체 스트림으로 변경 IntStream -> Stream<Integer>
		.sorted((a,b)->b-a)
		.forEach(System.out::println);
		
		
		//sorted(Comparator<? super T>)
		//사용자 정의 기준으로 정렬한다.
		
		//글자수 순으로 정렬
		sList.stream()
		.sorted((a,b) -> b.length() - a.length())
		.forEach(System.out::println);
		
		
		//중복제거
		//distinct()
		int[] iArr = {1,1,2,3,3,3,3,4,4,4,4,4,5,5,6};
		
		Arrays.stream(iArr)
		.distinct()
		.forEach(x -> System.out.print(x+" "));
		
		
		//객체의 equals()와 hashCode() 기준으로 중복을 제거
		//기본타입은 == 으로 비교해서 같으면 삭제함
		
		//제한 / 건너뛰기
		
		//limit(long maxSize)
		//앞에서부터 지정한 개수만 남긴다.
		IntStream.rangeClosed(1,10)
		.limit(3)
		.forEach(x -> System.out.print(x+" "));
		
		//skip(long n)
		//앞에 n개를 건너뛴다.
		IntStream.rangeClosed(1,10)
		.skip(5)
		.forEach(x -> System.out.print(x+" "));
		
		//상태확인
		//peek(Consumer<T>)
		sList.stream()
		.filter(s->s.length() >= 5)
		.peek(s->System.out.println("필터 통과 : "+s))
		.map(String::toUpperCase)
		.peek(s->System.out.println("변환 후 : "+s))
		.forEach(x -> System.out.print(x+" "));
	}
}
