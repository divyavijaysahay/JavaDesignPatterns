package divyavijay.DesignPatterns.Behavioral.state;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public interface Context {
	public void setState(State state);
	public void process();
	public String getContent();
	public void setContent(String content);
}
