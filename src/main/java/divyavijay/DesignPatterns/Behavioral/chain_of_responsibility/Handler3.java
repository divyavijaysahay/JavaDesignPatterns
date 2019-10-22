package divyavijay.DesignPatterns.Behavioral.chain_of_responsibility;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay
 */

public class Handler3 implements Handler {
	private Handler nextHandler;

	@Override
	public void handle(String request) {
		if (canHandle(request)) {
			System.out.println("Step 3 completed.");
		}

		if (this.nextHandler == null)
			return;
		this.nextHandler.handle(request);
	}

	@Override
	public void setNextHandler(Handler handler) {
		this.nextHandler = handler;
	}

	private boolean canHandle(String request) {
		return request.contains("3");
	}
}
