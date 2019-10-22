package divyavijay.DesignPatterns.Behavioral.chain_of_responsibility;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class Client {

	public static void main(String[] args) {
		String request = "123";
		Pipeline pipeline = new Pipeline();
		pipeline.handle(request);
	}
	
}
