package exam.index;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] fruits = {"사과","바나나","포도","복숭아"};
		
		try {
			System.out.print("인덱스 입력 : ");
			int index =  sc.nextInt();
			System.out.println("값 : "+fruits[index]);
		} catch (InputMismatchException e) {
			
		} catch(ArrayIndexOutOfBoundsException e) {
			
		}
	}
}
