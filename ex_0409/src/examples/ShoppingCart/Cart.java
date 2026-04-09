package examples.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	private List<Product> products = new ArrayList<>();
	
	//1. 상품 추가 (대신 같은 상품이 들어오면 수량 증가)
	public void addProduct(String name, int price, int quantity) {
		//list의 size()가 0이면 반복문들 안들어간다.
		for(Product p: products) {
			if(p.getName().equals(name)) {
				p.setQuantity(p.getQuantity()+quantity);
				System.out.println("기존 상품 수량 증가 완료");
				
			}
		}
		//넘어온 제품이 겹치지 않는다면 list에 추가하기
		products.add(new Product(name, price, quantity));
		System.out.println("상품 추가 완료");
	}
	
	//2. 장바구니 전체 출력
	public void printCart()	{
		
	}
	
	//3. 총 결제 금액 계산
	public void printTotalPrice() {
		
	}
	
	//4. 특정 상품 수량 증가
	public void addQuantity() {
		
	}
	
	//5. 특정 상품 삭제
	public void removeProduct(String name) {
		
	}
	
	
	

}
