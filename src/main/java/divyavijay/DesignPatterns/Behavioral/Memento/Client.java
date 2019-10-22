package divyavijay.DesignPatterns.Behavioral.Memento;

import java.util.Stack;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class Client {
	private static Stack<Memento> history;
	public static void main(String[] args) {
		history = new Stack<>();
		Editor editor = new EditorImpl();
		createAndSave(editor, history, "edit 1");
		createAndSave(editor, history, "edit 2");
		createAndSave(editor, history, "edit 3");
		createAndSave(editor, history, "edit 4");
		undo(2);		
		System.out.println(editor.getContent());
	}

	private static void undo(int steps) {
		while(!history.isEmpty() && steps > 0) {
			history.pop();
			steps--;
		}
		history.peek().restore();
	}

	private static void createAndSave(Editor editor, Stack<Memento> history, String content) {
		editor.setContent(content);
		history.push(editor.saveSanpshot());
	}
	
}
