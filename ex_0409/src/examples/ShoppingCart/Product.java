package examples.ShoppingCart;

public class Product {

	private String name; //상품명
	private int price; //가격
	private int quantity; //수량
	
	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getTotalPrice() {
		return price*quantity;
	}
	
	@Override
    public String toString() {
        return String.format("%s(%d원) x %d개", name, price, quantity);
    }

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}
	

	
	
}
