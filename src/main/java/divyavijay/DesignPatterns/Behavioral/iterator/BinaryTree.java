package divyavijay.DesignPatterns.Behavioral.iterator;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay
 */

public class BinaryTree implements Tree {

	private Node root, head;
	private Node sibling = null;
	private boolean firstNode = true;
	
	@Override
	public TreeIterator getIterator(IteratorType iteratorType) {
		if (iteratorType == IteratorType.BFS)
			return new BFSIterator(head);
		else
			return new DFSIterator(head);
	}

	@Override
	public Node getRoot() {
		return root;
	}

	public void addLeft(Node parent, Node child) {
		parent.left = child;
	}
	
	public void addRight(Node parent, Node child) {
		parent.right = child;
	}

	@Override
	public void add(Node node) {
		if(firstNode) {
			firstNode = false;
			root = node;
			head = root;
			return;
		}
		if(root.left == null)
			root.left = node;
		else {
			root.right = node;
			updateRoot();
		}				
	}

	private void updateRoot() {		
		if(sibling == null) {			
			sibling = root.right;
			root = root.left;
		} else {
			root = sibling;
			sibling = null;
		}
	}
}
