package divyavijay.DesignPatterns.Behavioral.iterator;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public interface Tree {
	void add(Node node);
	TreeIterator getIterator(IteratorType iteratorType);
	Node getRoot();
}
