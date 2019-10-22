package divyavijay.DesignPatterns.Behavioral.chain_of_responsibility;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public interface Handler {
	abstract void handle(String request);
	abstract void setNextHandler(Handler handler);
}
