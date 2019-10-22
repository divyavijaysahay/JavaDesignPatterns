package divyavijay.DesignPatterns.Behavioral.state;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class Client {

	public static void main(String[] args) {
		State state1 = new Text();
		State state2 = new Encrypt();
		State state3 = new Decrypt();
		
		Context context = new Message(" sample text ", state1);
		context.process();
		System.out.println(context.getContent());
		
		context.setState(state2);
		context.process();
		System.out.println(context.getContent());
		
		context.setState(state3);
		context.process();
		System.out.println(context.getContent());
	}
	
}
