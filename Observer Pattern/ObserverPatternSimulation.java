
public class ObserverPatternSimulation {
	public static void main(String[] args) {

		DeliveryData deliveryData = new DeliveryData();

		Observer ob1 = new Seller();
		Observer ob2 = new Manufacturer();
		Observer ob3 = new Buyer();

		deliveryData.register(ob1);
		deliveryData.register(ob2);
		deliveryData.register(ob3);

		deliveryData.updateDeliverLocation();
	}
}
