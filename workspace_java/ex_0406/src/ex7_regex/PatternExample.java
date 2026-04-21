package ex7_regex;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		/*
		String regExp = "(02|010)-[0-9]{3,4}-[0-9]{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		System.out.println(result);
		
		
		//주민등록번호 정규식 만들기
		regExp = "[0-9]{6}-[0-9]{7}";
	      
	    String ssn = "001234-1234567";
		
		String birth = ssn.substring(0,6);
		
		int year = Integer.parseInt("20"+birth.substring(0,2));
		System.out.println("생일 : "+year);
		int month = Integer.parseInt(birth.substring(2,4));
		System.out.println("월 : "+month);
		int day = Integer.parseInt(birth.substring(4,6));
		System.out.println("일 : "+day);
		
		try {
			LocalDate.of(year, month, day);
		} catch (Exception e) {
			System.out.println("잘못된 날짜");
		}
		
		
		
		//문자열이 숫자로만 이루어져 있는지 검사하는 코드
		String str1 = "12345";
		String str2 = "123a5";
		
		regExp = "[0-9]+";
		System.out.println(str1.matches(regExp));
		System.out.println(str2.matches(regExp));
		
		
		//아이디 형식 검사
		//영어 소문자로 시작
		//영어 소문자 + 숫자만 허용
		//5~12자
		String id = "eunseo5490000";
		regExp = "[a-z]{1}([a-z]|[0-9]){4,11}";
		System.out.println(id.matches(regExp));
		
		
		//이메일 형식 검사
		//아이디부분 : 영문, 숫자, _
		//@, 도메인 포함
		//예시 : java1234@gmail.com
		String email = "eunseo5490@gmail.ai";
		regExp = "[a-zA-z0-9_]+@[a-z].[a-z]{2,}";
		System.out.println(email.matches(regExp));
		
		
		String[] arr1 = {"123","abc","4567","a1b2"};
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i].matches("[가-힣]"));
		}
		*/	
		
		String[] arr = {"홍길동", "Tom","김철수","a1","김이박조길동"};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].matches("[가-힣]{2,5}"));
		}
		
		
		
		
	}
}
