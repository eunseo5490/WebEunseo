package stock_manage;

public class Main {
	public static void main(String[] args) {
		
		ProductService p = new ProductService();
		p.addProduct(new Product("P001", "삼각김밥", 1200, 10));
		p.addProduct(new Product("P002", "콜라", 2000, 0));
		p.addProduct(new Product("P003", "도시락", 4500, 5));
		
		System.out.println("=== 전체 상품 목록 ===");
		p.printAllProducts();
		System.out.println();
		
		//P001의 가격 10% 인상
		
		
		//P003의 상품명 앞뒤 공백 제거
		
		
		System.out.println("=== 재고 있는 상품 ===");
		p.printAllProducts();
		System.out.println();
		
		//재고 없는(품절) 상품 삭제
		
		
		System.out.println("=== 품절 상품 제외 ===");
		p.printAllProducts();
		System.out.println();
		
		
		
		//findByCode 메서드
		System.out.println(p.findByCode("P002"));
		
		
		
		
		
		
		
		
		
		
		
	}
}
