package divyavijay.DesignPatterns.Behavioral.Memento;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class EditorSnapshot implements Memento{

	private Editor editor;
	private String content;
	
	public EditorSnapshot(Editor editor, String content) {
		this.editor = editor;
		this.content = content;
	}
	
	@Override
	public void restore() {
		this.editor.setContent(content);
	}

}
