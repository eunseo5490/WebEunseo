package ex3_String;

import java.util.Arrays;

public class ByteToStringExample {
	public static void main(String[] args) {
		String data = "자바";
		
		
		//String -> byte 배열
		byte[] arr1 = data.getBytes();
		//문자열을 컴퓨터가 처리할 수 있는 숫자(바이트)로 바꾼 것
		System.out.println(Arrays.toString(arr1));
		
		
		//byte 배열 -> String 문자열
		String str1 = new String(arr1);
		System.out.println(str1);
		
		
		
		
		
	}
}
