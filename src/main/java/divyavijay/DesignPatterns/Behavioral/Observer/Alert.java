package divyavijay.DesignPatterns.Behavioral.Observer;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class Alert implements Publisher {

	private SubscriptionManager manager;

	public Alert() {
		this.manager = SubscriptionManager.getInstance();
	}
	
	@Override
	public void subscribe(Subscriber subscriber) {
		this.manager.add(this.getClass().getSimpleName(), subscriber);
	}

	@Override
	public void unsubscribe(Subscriber subscriber) {
		this.manager.remove(this.getClass().getSimpleName(), subscriber);
	}

	@Override
	public void notifyAllSubscribers() {
		alert("Fire Alert!");
	}
	
	private void alert(String message) {
		this.manager.notifyAll(this.getClass().getSimpleName(), message);		
	}

}
