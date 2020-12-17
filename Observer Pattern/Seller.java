
public class Seller implements Observer {
	private String deliveryLocation;

	public void update(String data) {
		this.deliveryLocation = data;
		showLocation();
	}

	private void showLocation() {
		System.out.println("Notification : Location at Seller - " + this.deliveryLocation);
	}

}
