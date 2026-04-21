package exam.converter;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Converter data = new Converter();
		
		try {
			System.out.print("데이터를 입력해주세요. \n> ");
			data.toInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("해당 데이터는 숫자로 변환할 수 없습니다.");
			e.printStackTrace();
		}
	}
}
