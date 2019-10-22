package divyavijay.DesignPatterns.Behavioral.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public final class SubscriptionManager {

	private HashMap<String, List<Subscriber>> subscriptions;
	private static SubscriptionManager manager = null;
	
	private SubscriptionManager() {
		this.subscriptions = new HashMap<>();
	}
	
	public static SubscriptionManager getInstance() {
		if(manager == null) {
			manager = new SubscriptionManager();
		}
		return manager;
	}
	
	public void add(String publisher, Subscriber subscriber) {
		if(!this.subscriptions.containsKey(publisher))
			this.subscriptions.put(publisher, new ArrayList<Subscriber>());
		this.subscriptions.get(publisher).add(subscriber);
	}
	
	public void remove(String publisher, Subscriber subscriber) {
		if(this.subscriptions.containsKey(publisher))
			this.subscriptions.get(publisher).remove(subscriber);
	}
	
	public void notifyAll(String publisher, String message) {
		for(Subscriber subscriber : this.subscriptions.get(publisher))
			subscriber.notify(message);
	}
}
