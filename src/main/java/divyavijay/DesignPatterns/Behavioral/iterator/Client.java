package divyavijay.DesignPatterns.Behavioral.iterator;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class Client {

	public static void main(String[] args) {
		Tree tree = new BinaryTree();
		tree.add(new Node(1));
		tree.add(new Node(2));
		tree.add(new Node(3));
		tree.add(new Node(4));
		tree.add(new Node(5));
		tree.add(new Node(6));
		tree.add(new Node(7));
		
		StringBuilder bfs = new StringBuilder();
		StringBuilder dfs = new StringBuilder();
		String resultBFS = "1234567";
		String resultDFS = "1376254";
		
		TreeIterator iteratorBFS = tree.getIterator(IteratorType.BFS);
		TreeIterator iteratorDFS = tree.getIterator(IteratorType.DFS);
		while(iteratorBFS.hasNext() && iteratorDFS.hasNext()) {
			bfs.append(iteratorBFS.getNext().val);
			dfs.append(iteratorDFS.getNext().val);
		}
		System.out.println(bfs.toString());
		System.out.println(dfs.toString());
		System.out.println("BFS: " + resultBFS.equals(bfs.toString()));
		System.out.println("DFS: " + resultDFS.equals(dfs.toString()));
	}
	
}
