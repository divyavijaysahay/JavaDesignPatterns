package divyavijay.DesignPatterns.Behavioral.chain_of_responsibility;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class Pipeline implements Handler {

	private Handler handler1;	
	private Handler nextHandler;
	
	public Pipeline() {
		create();
	}
	
	private void create() {
		handler1 = new Handler1();
		Handler handler2 = new Handler2();
		Handler handler3 = new Handler3();
		
		handler1.setNextHandler(handler2);
		handler2.setNextHandler(handler3);
	}

	@Override
	public void handle(String request) {
		handler1.handle(request);
		
		if(this.nextHandler == null) return;
		this.nextHandler.handle(request);
	}

	@Override
	public void setNextHandler(Handler handler) {
		this.nextHandler = handler;
	}
	
}
