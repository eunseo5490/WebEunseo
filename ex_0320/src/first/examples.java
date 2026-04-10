package first;

import java.util.Scanner;

public class examples {
	   public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.print("이름 : ");
		   String name = sc.nextLine();
		   
		   System.out.print("Java : ");
		   int java = sc.nextInt();
		   
		   System.out.print("DB : ");
		   int db = sc.nextInt();
		   
		   System.out.print("HTML : ");
		   int html = sc.nextInt();
		   
		   int totalScore = java + db + html;
		   
		   double avg = totalScore / 3.0;
		   
		   String isPass = null;
		   
		   System.out.println();
		   
		   if(avg >= 60) {
			   isPass = "합격";
			   System.out.println("합격");
		   } else if(avg>=0 && avg<60) {
			   isPass = "불합격";
			   System.out.println("불합격");
		   }
		   
		   System.out.println();
		   System.out.println("이름 : "+name);
		   System.out.println("이름 : "+totalScore);
		   System.out.println("평균 : "+avg);
		   System.out.println("결과 : "+isPass);
		   
	}
}
