package stock_manage;

public class Product {
	
	private String code;
	private String name;
	private int price;
	private int stock;
	
	public Product(String code, String name, int price, int stock) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	public String getCode() {
		return code;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getStock() {
		return stock;
	}
	
	@Override
	public String toString() {
		return "Product{code='"+code+"', name='"+name+"', price="+price+", stock="+stock+"}";
	}
	
	
	
}
