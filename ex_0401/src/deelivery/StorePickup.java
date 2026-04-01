package deelivery;

public class StorePickup extends Delivery{
	
	@Override
	public void ship() {
		System.out.println("매장에서 직접 수령합니다.");
	}
}
