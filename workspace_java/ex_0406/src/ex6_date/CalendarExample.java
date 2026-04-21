package ex6_date;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		
		//Date 클래스의 문제점을 해결하려고 만든 클래스
		//Calendar 클래스는 달력을 표현하는 추상클래스
		//날짜와 시간을 계산하는 방법이 지역과 문화에 따라 다르기 때문에
		//특정 역법에 따르는 달력은 자식 클래스에서 구현하도록 되어있다.
		
		//특별한 역법을 사용하는 경우가 아니라면 직접 하위 클래스를 만들 필요는 없다
		//Calendar 클래스의 정적 메서드인 getInstance() 메서드를 사용해 컴퓨터 설정 기준으로 객체를 얻음\
		
		Calendar now = Calendar.getInstance();
		
		//Calendar가 제공하는 날짜와 시간에 대한 정보를 얻기 위해서는 get() 메서드를 사용한다.
		int year = now.get(Calendar.YEAR);
		System.out.println(year+"년");
		int month = now.get(Calendar.MONTH); //0이 1월임
		System.out.println((month+1)+"월");
		int date = now.get(Calendar.DATE);
		System.out.println(date+"일");
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week+"요일");
		
		System.out.println(now.get(Calendar.HOUR)+"시");
		System.out.println(now.get(Calendar.MINUTE)+"분");
		System.out.println(now.get(Calendar.SECOND)+"초");
		

	}
}
