package divyavijay.DesignPatterns.Behavioral.command.basic;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class Handler1 implements Command {

	@Override
	public void execute() {
		System.out.println("Executed handler1");
	}

}
