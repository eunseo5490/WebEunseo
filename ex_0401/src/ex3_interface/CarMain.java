package ex3_interface;

public class CarMain {
	public static void main(String[] args) {
		Car c = new Car();
		
		c.t1 = new HankookTire();
		c.t2 = new HankookTire();
		
		c.run();
		
		c.t1 = new KumhoTire();
		c.t2 = new KumhoTire();
		
		c.run();
		
	}
}
