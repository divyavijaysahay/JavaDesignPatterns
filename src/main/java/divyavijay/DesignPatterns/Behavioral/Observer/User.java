package divyavijay.DesignPatterns.Behavioral.Observer;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class User implements Subscriber {
	String name;
	
	public User(String name) {
		this.name = name;
	}

	@Override
	public void notify(String message) {
		System.out.println(this.name + " received: " + message);
	}
}
