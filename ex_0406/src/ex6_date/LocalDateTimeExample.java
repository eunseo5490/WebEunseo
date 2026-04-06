package ex6_date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class LocalDateTimeExample {
	public static void main(String[] args) {
		
		//Java 8 이후에 등장한 현대적인 날짜 API
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		//원하는 날짜와 시간을 직접 만들기
		LocalDateTime dateTime = LocalDateTime.of(2026, 4, 6, 16, 13, 40);
		System.out.println(dateTime);
		
		//날짜/시간 전체를 알고 있기 때문에
		//연도, 월, 일, 시, 분 등을 꺼낼 수 있다.
		System.out.println("연도 : "+now.getYear());
		System.out.println("월 : "+now.getMonthValue());
		System.out.println("일 : "+now.getDayOfMonth());
		System.out.println("시 : "+now.getHour());
		System.out.println("분 : "+now.getMinute());
		System.out.println("초 : "+now.getSecond());
		
		//날짜와 시간의 덧뺄셈
		System.out.println("10일 뒤 : "+now.plusDays(10));
		System.out.println("10달 뒤 : "+now.plusMonths(10));
		
		
		
		//String result = now.format(formatter);
		//System.out.println(result);
		
		//문자열을 LocalDataTime으로 바꾸기
		String str = "2026/04/06 16:37";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		
		LocalDateTime dateTime2 = LocalDateTime.parse(str,formatter);
		
		//시간을 필요로 하는 곳에 거의 다 사용됨
		//게시글 작성 시간, 회원가입 시간, 주문 생성 시간, 예약 시간, 마감 시간, 로그인 시간, 수정 시간
		
		
		//날짜 비교
		LocalDateTime meeting = LocalDateTime.of(2026,4,10,14,0);
		System.out.println(now.isBefore(meeting));
		System.out.println(now.isAfter(meeting));
		System.out.println(now.isEqual(meeting));

		
		//날짜의 특정 부분만 바꾸기
		LocalDateTime changed = now.withYear(2030)
				.withMonth(12)
				.withDayOfMonth(25)
				.withHour(9);
		System.out.println(changed);
		
		
		LocalDateTime start = now.withHour(9).withMinute(0).withSecond(0);
		LocalDateTime end = now.withHour(18).withMinute(0).withSecond(0);
		
		if(now.isAfter(start) && now.isBefore(end)) {
			System.out.println("예약 가능");
		} else {
			System.out.println("예약 불가능");
		}
		
		
	}
}
