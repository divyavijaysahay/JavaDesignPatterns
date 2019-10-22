package divyavijay.DesignPatterns.Behavioral.command.basic;

import java.util.Arrays;
import java.util.List;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class Client {
	
	public static void main(String[] args) {
		List<Command> commands = getCommands();
		for(Command command : commands)
			command.execute();
	}

	private static List<Command> getCommands() {
		return Arrays.asList(new Handler1(), new Handler2());
	}
	
}
