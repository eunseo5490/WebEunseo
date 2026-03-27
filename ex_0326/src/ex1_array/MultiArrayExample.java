package ex1_array;

import java.util.Scanner;

public class MultiArrayExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		//2차원 배열
		//1차원 배열을 요소로 갖는 배열

		//2차원 배열의 초기화
		int [][] arr = { {1,2,3},{4,5,6},{7,8,9} };

		//2차원 배열의 선언과 생성
		//1차원 배열과 마찬가지로 길이를 지정해줘야 한다.
		int [][] ar = new int[2][3]; //괄호2개 안에 숫자3개

		//배열의 각 공간에 접근하는 방법
		//
		//만약 arr에 5에 접근해야 할 경우
		System.out.println(arr[1][1]);

		//arr.legth : 2차원 배열의 길이
		//arr[i].legth : 해당 1차원 배열의 길이
		
		
		//각 1차원 배열에 들어가는 데이터의 개수가 다른 경우
		
		//2차원 배열에 들어가는 요소의 개수만 지정한다.
		int[][] iAr = new int[3][];
		
		//각 1차원 배열에 들어가는 데이터의 개수를 따로 지정할 수 있다.
		iAr[0] = new int[1];
		iAr[1] = new int[2];
		iAr[2] = new int[3];
		
		
		//다음 2차원 배열의 모든 요소의 총 합을 구하시오
		
		int[][] num = {{1},{2,3},{4,5,6},{7,8,9,10}};
		
		int sum = 0;
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				sum += num[i][j];
				System.out.println(sum);
			}
		}
		*/
		
		//학생들의 수학과 영어성적을 등록하는 프로그램이 있다.
		//프로그램을 실행하면 저장할 인원 수를 입력한 후,
		//입력받은 수 만큼의 학생들의 이름과 성적(국어/영어/수학)을 입력받는다.
		
//		예)
//		등록할 인원 수 : 2
//		-----------------
//		이름 : 홍길동
//		국어 : n점
//		수학 : n점
//		영어 : n점
//		-----------------
//		이름 : 고길동
//		국어 : n점
//		수학 : n점
//		영어 : n점
//		-----------------
//		2명 등록 완료
//		홍길동 n n n
//		고길동 n n n
		
		System.out.print("등록할 인원 수 : ");
		int headCount = sc.nextInt();
		
		String [][] info = new String[headCount][3];
		
		System.out.print("-----------------");
		
		for(int i=0;i<info.length;i++) {
			System.out.print("\n이름 : ");
			info[i][0] = sc.nextLine();
			
			System.out.print("");
				
			System.out.print("국어 : ");
			info[i][1] = sc.nextLine();
				
			System.out.print("영어 : ");
			info[i][2] = sc.nextLine();
				
			System.out.print("수학 : ");
			info[i][3] = sc.nextLine();
			
			System.out.println("\n-----------------");
		}
		
		
		
		
		
//		int [][] info = new int[headCount][4];
//		
//		for (int i=0; i<info.length;i++) {
//			for(int j=0;j<info[i].length;j++) {
//				System.out.println(i+"번 학생의 정보를 입력해주세요.\n> ");
//				
//				String name = sc.nextLine();
//				int kor = sc.nextInt();
//				int eng = sc.nextInt();
//				int math = sc.nextInt();
				

		System.out.println(headCount+"명 등록 완료");
		
		for(int i=0;i<info.length;i++) {
			for(int j=0;j<info[i].length;j++) {
				System.out.print(info[i][j]);
			}
			System.out.println("");
		}
				
				
				
		
		
		
		
	}

}
