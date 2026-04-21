package exam.productinfo;

public class Main {
	public static void main(String[] args) {
		Object obj = new Object();
		
		obj.toString();
		
		Product keyboard = new Product("키보드", 5000, 10);
		Product mouse = new Product("마우스", 15000, 20);
		Product monitor = new Product("키보드", 105000, 100);
		
		System.out.println(keyboard);
		System.out.println(mouse);
		System.out.println(monitor);
	}
}
