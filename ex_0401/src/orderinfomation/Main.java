package orderinfomation;

public class Main {
	public static void main(String[] args) {
		Order order1 = new Order("2026003");
		Order.Item items = order1.new Item("키보드",50000,2);
		
		order1.printOrderInfo(items);
	}
}
