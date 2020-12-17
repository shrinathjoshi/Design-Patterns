import java.util.ArrayList;
import java.util.List;

public class DeliveryData implements Subject {
	private List<Observer> observerList;
	private String deliveryLocation;

	public DeliveryData() {
		this.observerList = new ArrayList<Observer>();
		this.deliveryLocation = "";
	}

	public void register(Observer obj) {

		this.observerList.add(obj);
	}

	public void unRegister(Observer obj) {

		this.observerList.remove(obj);
	}

	public void notifyObservers() {

		for (Observer ob : this.observerList) {
			ob.update(this.deliveryLocation);
		}
	}

	public void updateDeliverLocation() {
		this.deliveryLocation = newDeliveryLocation();
		notifyObservers();
	}

	public String newDeliveryLocation() {
		return "Mumbai";
	}
}
