package stock_manage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ProductService {
	
	List<Product> productCode = new ArrayList<Product>();
	
	//1. 상품 등록
	public void addProduct(Product product) {
		productCode.add(product);
	}
	
	//2. 전체 상품 조회
	public void printAllProducts() {
		System.out.println("=== 전체 상품 목록 ===");
		
		for(Product p : productCode) {
			System.out.println(p.toString());
		}
		
		System.out.println();
	}
	
	//3. 상품 코드로 조회
	public Product findByCode(String code) {
		for(int i=0; i<productCode.size(); i++) {
			if(productCode.get(i).getCode().equals(code)) {
				return productCode.get(i);
			}
		}
		return null;
	}
	
	//4. 상품 정보 수정
	public void updateProduct(String code, Consumer<Product> updater) {
		//코드에 해당하는 제품 한 개 찾기
		Product p = findByCode(code);
		
		if(p==null) {
			System.out.println("상품이 존재하지 않습니다.");
			return;
		}
		
		//넘어온 람다식 실행
		updater.accept(p);
	}
	
	//5. 조건에 맞는 상품 조회
	public void findProductsByCondition(Predicate<Product> predicate) {
		System.out.println("=== 재고 있는 상품 ===");
		
		//전체 순회하면서
		for(Product p : productCode) {
			if(predicate.test(p)) {
				System.out.println(p);
			}
		}
		
		System.out.println();
	}
	
	//6. 조건에 맞는 상품 삭제
	public void deleteProductsByCondition(Predicate<Product> predicate) {
		for(Product p : productCode) {
			if(predicate.test(p)) {
				productCode.remove(p);
			}
		}
	}
	
	//6번의 다른 코드 방식
	public void deleteProductsByCondition2(Predicate<Product> predicate) {
		Iterator<Product> iter = productCode.iterator();
		
		//remove(Object o) : 일치하는 첫 번째를 삭제
		
		while(iter.hasNext()) {
			Product p = iter.next();
			if(predicate.test(p)) {
				//어떤 제품이 몇 번 index에 들어있는 지 파악하기 힘들기 때문에 iterator를 사용
				iter.remove();
			}
		}
	}
	
	
	
	
}
