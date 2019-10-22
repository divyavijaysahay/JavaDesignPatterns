package divyavijay.DesignPatterns.Behavioral.Observer;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public interface Publisher {
	public void subscribe(Subscriber subscriber);
	public void unsubscribe(Subscriber subscriber);
	public void notifyAllSubscribers();
}
