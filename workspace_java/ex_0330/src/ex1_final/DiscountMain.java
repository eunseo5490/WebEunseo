package ex1_final;

import java.util.Scanner;

public class DiscountMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품 금액을 입력해주세요.\n> ");
		int price = sc.nextInt();
		
		Discount discount = new Discount();
		double result = discount.calculatePrice(price);
		
		System.out.println("[할인가] "+result);
		
		
		
		
		
		
		
		
		
	}
}
