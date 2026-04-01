package deelivery;

public class Main {
	public static void main(String[] args) {
		
		RoketDelivery roket = new RoketDelivery();
		StorePickup store = new StorePickup();
		
		Delivery[] d = {new RoketDelivery(), new StorePickup()};
		
		roket.printInvoice();
		roket.ship();
		roket.complete();
		
		store.printInvoice();
		store.ship();
		store.complete();
		
		for(Delivery delivery : d) {
			delivery.printInvoice();
			delivery.ship();
			delivery.complete();
			
		}
	}
}
