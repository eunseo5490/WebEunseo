package ex_variable;

public class Ex2_VariableExchange {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		//변수 x에 들어있는 값과 변수 y에 들어있는 값을 교환해보기
		//필요하다면 변수 추가 가능
		
		int exchange = x;
		x = y;
		y = exchange;
		System.out.println("x="+x+", y="+y);

	}

}
