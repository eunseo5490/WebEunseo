package ex3_generic.exam;

import java.util.Arrays;

public class ArrayPrinter {
	
	//배열을 외부에서 전달 받아 화면에 출력하는 기능을 가진
	//printArray 제네릭 메서드 작성하기
	public <T> void printArray(T[] value) {
		T[] arr = value;
		System.out.println(Arrays.toString(arr));
	}
	//Main 메서드에서 다음의 배열들을 출력하기
	//String [] name = {"김철수", "이영희", "박민수"};
	//Integer [] nums = {10, 20, 30};
	
	public static void main(String[] args) {
		String [] name = {"김철수", "이영희", "박민수"};
		Integer [] nums = {10, 20, 30};
		
		ArrayPrinter arr1 = new ArrayPrinter();
		arr1.printArray(name);
		arr1.printArray(nums);
	}
}
