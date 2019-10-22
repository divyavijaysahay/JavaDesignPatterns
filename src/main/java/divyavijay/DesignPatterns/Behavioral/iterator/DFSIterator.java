package divyavijay.DesignPatterns.Behavioral.iterator;

import java.util.Stack;

import javax.naming.OperationNotSupportedException;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class DFSIterator implements TreeIterator {

	private Node current = null;
	private Stack<Node> stack;
	
	public DFSIterator(Node root) {
		this.stack = new Stack<>();
		this.current = root;
		this.stack.push(current);
	}
	
	private void lazyLoad() {
		if(current == null) return;
		
		for(Node child : current.getChildren())
			stack.push(child);
	}

	@Override
	public boolean hasNext() {
		return !stack.isEmpty();
	}

	@Override
	public Node getNext() {
		if(stack.isEmpty()) {
			try {
				throw new OperationNotSupportedException("Tree is empty.");
			} catch (OperationNotSupportedException e) {
				e.printStackTrace();
			}
		}
		current = stack.pop();
		lazyLoad();
		return current;
	}

}
