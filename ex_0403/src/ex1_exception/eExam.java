package ex1_exception;

import java.util.Scanner;

public class eExam {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		try {
			System.out.println(n);
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
