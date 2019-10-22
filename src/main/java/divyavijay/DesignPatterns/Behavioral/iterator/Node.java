package divyavijay.DesignPatterns.Behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay
 */

public class Node {

	Node left;
	Node right;
	int val;

	public Node(int val) {
		this.val = val;
	}

	public List<Node> getChildren() {
		List<Node> children = new ArrayList<>();
		if (this.left != null)
			children.add(left);
		if (this.right != null)
			children.add(right);
		return children;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Node) {
			Node n = (Node) o;
			return n.val == this.val;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.val;
	}
}
