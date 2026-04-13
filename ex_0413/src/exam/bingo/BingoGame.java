package exam.bingo;

import java.util.Scanner;

//이 클래스는 빙고 게임 프로세스(게임시작, 빙고 숫자 입력 등)를 담당
public class BingoGame {
	Scanner sc;
	Bingo b;
	
	public BingoGame() {
		sc = new Scanner(System.in);
		b = new Bingo();

	}
	
	public void start() {
		
		while(true) {
			b.printBoard();
			
			b.countBingo();
			
			System.out.println();
			
			System.out.print("체크할 숫자는?\n> ");
			b.markNumber(sc.nextInt());
			
			System.out.println();
			
			System.out.println("빙고 개수 : "+b.countBingo()+"줄");
			
			if(b.countBingo() >= 3) {
				System.out.println("[ 3줄 빙고 완성! ]");
				System.out.println("[ 게임을 종료합니다. ]");
				break;
			}
			
			
			
		}

		
		
		
		
		
		
		
		
	}
	
	
}
