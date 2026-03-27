package ex4_student;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student minsu = new Student();
		minsu.name = "minsu";
		minsu.age = 20;
		minsu.score = "80";
		
		Student gildong = new Student();
		gildong.name = "gildong";
		gildong.age = 21;
		gildong.score = "85";
		
		Student yeonghee = new Student();
		yeonghee.name = "yeonghee";
		yeonghee.age = 22;
		yeonghee.score = "90";
		
		Student[] students = {minsu, gildong, yeonghee};
		
		//배열에는 같은 타입의 데이터만 넣을 수 있다.
		//데이터의 타입은 배열 앞에 명시한다.
		
		//배열에 들어있는 내용을 모두 출력하기
		for(int i=0; i<students.length; i++) {
			System.out.println("------------------");
			System.out.println("이름 : "+students[i].name);
			System.out.println("나이 : "+students[i].age);
			System.out.println("성적 : "+students[i].score);
		}
		
		
		
		Student a = new Student();
		System.out.println("학생의 정보를 입력해주세요.");
		
		System.out.print("\n이름을 한글로 입력해주세요.\n> ");
		a.name = sc.nextLine();
		
		System.out.print("\n나이를 숫자로만 입력해주세요.\n> ");
		a.age = sc.nextInt();
		
		System.out.print("\n성적을 A~F 중 하나만 입력해주세요.\n> ");
		a.score = sc.next();
		
		System.out.println(" ");
		
		
		System.out.println("------------------");
		System.out.printf("1번 - %s/%d세/%s\n", a.name, a.age, a.score);
		System.out.println("------------------");
		
	
		

	}

}
