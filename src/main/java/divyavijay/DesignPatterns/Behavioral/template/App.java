package divyavijay.DesignPatterns.Behavioral.template;

/**
 * @Date : Oct 23, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class App {

	public static void main(String[] args) {
		Base base = new Client1();
		base.template();
		
		base = new Client2();
		base.template();
	}
	
}
