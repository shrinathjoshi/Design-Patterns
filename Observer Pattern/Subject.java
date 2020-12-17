
public interface Subject {
	public void register(Observer obj);

	public void unRegister(Observer obj);

	public void notifyObservers();

}
