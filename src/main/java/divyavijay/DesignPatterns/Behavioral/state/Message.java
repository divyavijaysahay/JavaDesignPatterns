package divyavijay.DesignPatterns.Behavioral.state;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class Message implements Context {

	private State currentState;
	private String content;
	
	public Message(String content, State initialState) {
		this.content = content;
		this.currentState = initialState;
	}
	
	@Override
	public void setState(State state) {
		this.currentState = state;
	}

	@Override
	public void process() {
		this.currentState.process(this);
	}

	@Override
	public String getContent() {
		return this.content;
	}
	
	@Override
	public void setContent(String content) {
		this.content = content;
	}
}
