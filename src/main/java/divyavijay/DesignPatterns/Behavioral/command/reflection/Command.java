package divyavijay.DesignPatterns.Behavioral.command.reflection;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay
 */

/**
 * Note: Integer class instead of int as reflect method works with Objects only.
 * 
 * @author jeet sahay
 *
 */
public class Command {

	Integer state = 0;
	
	public Command(Integer state) {
		this.state = state;
	}
	
	public Integer add(Integer a, Integer b) {
		return a + b;
	}
	
	public Integer multiply(Integer a, Integer b) {
		return a * b;
	}
	
	public Integer subtract(Integer a, Integer b) {
		return a - b;
	}
	
	public Integer divide(Integer a, Integer b) {
		return a / b;
	}
	
	public Integer getState() {
		return this.state;
	}
}
