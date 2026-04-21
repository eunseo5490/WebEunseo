package e1_method;

import java.util.Scanner;

public class TimesTableMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[ 구구단 ]");
		System.out.println("--------------------------------");
		
		
		
		TimesTable table = new TimesTable();
		
		boolean isValue=true;
		
		do {
			System.out.print("출력할 단(1~9)을 입력해주세요. (0 입력 시 종료)\n> ");
			int dan = sc.nextInt();
			if(dan == 0) {
				isValue=false;
			}else if(dan>=1 && dan<=9) {
				table.showTable(dan);
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				System.out.println("--------------------------------");
			}
		} while(isValue);
		
		System.out.println("프로그램이 종료됩니다.");
		System.out.println("--------------------------------");
		
		
		
	}

}
