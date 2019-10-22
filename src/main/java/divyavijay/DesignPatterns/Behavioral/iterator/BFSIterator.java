package divyavijay.DesignPatterns.Behavioral.iterator;

import java.util.LinkedList;
import java.util.Queue;

import javax.naming.OperationNotSupportedException;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class BFSIterator implements TreeIterator {

	private Node current = null;
	private Queue<Node> queue;
	
	public BFSIterator(Node root) {
		this.queue = new LinkedList<>();
		this.current = root;
		this.queue.add(current);
	}
	
	private void lazyLoad() {
		if(current == null) return;
		
		for(Node child : current.getChildren())
			queue.add(child);
	}

	@Override
	public boolean hasNext() {
		return !queue.isEmpty();
	}

	@Override
	public Node getNext() {
		if(queue.isEmpty()) {
			try {
				throw new OperationNotSupportedException("Tree is empty.");
			} catch (OperationNotSupportedException e) {
				e.printStackTrace();
			}
		}
			
		current = queue.poll();
		lazyLoad();
		return current;
	}

}
