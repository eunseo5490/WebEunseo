package orderinfomation;

public class Order {
	
	
	private String orderNumber;
	
	public Order(String orderNumber) {
		this.orderNumber = orderNumber;
		
	}
	
	
	class Item {
		String name;
		int price;
		int count;
		
		public Item(String name, int price, int count) {
			this.name = name;
			this.price = price;
			this.count = count;
		}
		
		void printInfo() {
			System.out.printf("[ 상품명 : %s ] [ 가격 : %d원 ] [ 수량 : %d개 ]\n", name, price, count);
		}
	}
	
	
	public void printOrderInfo(Item item) {
		System.out.println("주문번호 "+orderNumber);
		item.printInfo();
	}
	
	
	
	

}
