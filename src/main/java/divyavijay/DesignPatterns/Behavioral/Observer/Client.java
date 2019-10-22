package divyavijay.DesignPatterns.Behavioral.Observer;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class Client {

	public static void main(String[] args) {
		User u1 = new User("u1");
		User u2 = new User("u2");
		User u3 = new User("u3");
		Concert concert = new Concert();
		concert.subscribe(u1);
		concert.subscribe(u2);
		concert.subscribe(u3);
		
		Alert alert = new Alert();
		alert.subscribe(u1);
		alert.subscribe(u3);
		
		concert.notifyAllSubscribers();
		concert.unsubscribe(u1);
		System.out.println();
		
		concert.notifyAllSubscribers();
		System.out.println();
		
		alert.notifyAllSubscribers();
	}
	
}
