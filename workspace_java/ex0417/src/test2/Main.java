package test2;

public class Main {
	public static void main(String[] args) {
		Product p = new Product("라떼", 10);
		
		p.printInfo();
		p.sell(3);
		p.printInfo();
		p.sell(10);
		p.printInfo();
	}
}
