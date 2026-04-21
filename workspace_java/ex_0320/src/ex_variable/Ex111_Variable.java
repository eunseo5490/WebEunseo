package ex_variable;

public class Ex111_Variable {

	public static void main(String[] args) {
		//sysout 자동완성 이용하기 (Ctrl+SpaceBar+sysout)
		System.out.println(10);
		System.out.println(3.14);
		System.out.println("홍길동");
		
		int x; //정수형 변수 x 선언
		
		x = 10; //변수 x에 10을 대입
		
		System.out.println(x+1);
		
		//연산 후 x의 값은?
		System.out.println(x);
		
		x = 55; //기존 값을 버리고 새 값을 대입할 수 있음
		System.out.println(x);
		
		//변수 x의 값에 연산을 한 후 다시 대입해 연산한 값을 유지할 수 있음
		x = x + 1;
		
		System.out.println(x);
		
		//대입은 필요한만큼 할 수 있음
		
		//선언과 동시에 값을 대입할 수 있음
		int y = 30;
		
		//변수는 출력문이나 연산식에 사용되어 값을 활용할 수 있음
		
		int hour = 3;
		int minute = 5;
		System.out.println(hour+"시간 "+minute+"분");
		
		//총 몇 분인지 구해보기
		int totalMinute = hour*60+minute;
		System.out.println("총 "+totalMinute+"분");
		
		
		//변수는 또 다른 변수에 대입되어 메모리 간에 값을 복사할 수 있음
		
		int a = 3;
		int b = a;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		

		

	}

}
