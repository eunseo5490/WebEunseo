package stock_manage;

public class Main {
	public static void main(String[] args) {
		
		ProductService ps = new ProductService();
		
		//제품 등록
		ps.addProduct(new Product("P001", "삼각김밥", 1200, 10));
		ps.addProduct(new Product("P002", "사탕", 300, 30));
		ps.addProduct(new Product("P003", "콜라", 2100, 0));
		ps.addProduct(new Product("P004", "도시락", 4500, 5));
		
		//모든 제품 조회
		ps.printAllProducts();
		
		//P001의 가격 10% 인상
		ps.updateProduct("P001", product -> {
			product.setPrice((int)(product.getPrice() * 1.1));
			return;
		});
		ps.printAllProducts();
		
		//재고가 0보다 큰 제품만 조회
		ps.findProductsByCondition(p->p.getStock() > 0);
		ps.printAllProducts();
		
		
		
		//P003의 상품명 앞뒤 공백 제거

		
		//재고 없는(품절) 상품 삭제
		ps.deleteProductsByCondition2(p->p.getStock() == 0);
		ps.printAllProducts();
		
		
		
		
		
		
		
		
		
		
		
	}
}
