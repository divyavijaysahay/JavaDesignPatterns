package divyavijay.DesignPatterns.Behavioral.command.reflection;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class Client {

	public static void main(String[] args) {
		ReflectCommand[] commands = {
				new ReflectCommand(new Command(1), "add", new Integer[]{1,2}),
				new ReflectCommand(new Command(2), "multiply", new Integer[] {2,3})
		};
		
		for(ReflectCommand command : commands)
			System.out.println(command.execute());
	}
	
}
