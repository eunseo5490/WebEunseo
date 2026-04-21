package test2;

public class Product {
	private String name;
	private int stock;
	
	public Product(String name, int stock) {
		this.name = name;
		this.stock = stock;
	}
	
	public void sell(int amount) {
		if(amount>stock) {
			System.out.println("[ 재고가 부족합니다. ]");
		} else {
			stock -= amount;
			System.out.println("[ 판매 완료 ]");
		}
	}
	
	public void printInfo() {
		System.out.println("상품 이름 : "+name);
		System.out.println("상품 재고 : "+stock);
	}
	
}
