package divyavijay.DesignPatterns.Behavioral.command.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay
 */

public class ReflectCommand {

	// Pre-registered object.
	private Object reciever;

	// Pre-registered request.
	private Method method;

	// Arguments for request.
	private Object[] args;

	public ReflectCommand(Object reciever, String methodName, Object[] args) {
		this.reciever = reciever;
		this.args = args;
		Class<? extends Object> recieverClass = reciever.getClass();
		Class[] argsClass = new Class[args.length];
		for (int i = 0; i < args.length; i++) {
			argsClass[i] = args[i].getClass();
		}
		
		try {
			method = recieverClass.getMethod(methodName, argsClass);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}

	public Object execute() {
		try {
			return method.invoke(this.reciever, this.args);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
