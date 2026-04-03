package exam.cal;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Converter c = new Converter();
		
		OrderService os = new OrderService();
		
		
		try {
			System.out.print("상품 가격 입력 : ");
			String priceStr = sc.next();
			
			System.out.print("상품 가격 입력 : ");
			String amountStr = sc.next();
			
			int price = c.toInt(priceStr);
			int amount = c.toInt(amountStr);
			
			int total = os.total(price, amount);
			System.out.println("총 금액 : "+total);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
