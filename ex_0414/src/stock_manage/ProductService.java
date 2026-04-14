package stock_manage;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
	
	List<Product> productCode = new ArrayList<Product>();
	
	//1. 상품 등록
	public void addProduct(Product product) {
		productCode.add(product);
	}
	
	//2. 전체 상품 조회
	public void printAllProducts() {
		for(Product p : productCode) {
			System.out.println(p.toString());
		}
		
	}
	
	//3. 상품 코드로 조회
	public Product findByCode(String code) {
		for(int i=0; i<productCode.size(); i++) {
			if(productCode.get(i).getCode().equals(code)) {
				return productCode.get(i);
				break;
			} else {
				return null;
			}
		}
	}
	/*
	//4. 상품 정보 수정
	public void updateProduct(String code, Function<Product, Product> updater) {
		
	}
	
	//5. 조건에 맞는 상품 조회
	public void findProductsByCondition(Predicate<Product> predicate) {
		
	}
	
	//6. 조건에 맞는 상품 삭제
	public void deleteProductsByCondition(Predicate<Product> predicate) {
		
	}
	*/
}
