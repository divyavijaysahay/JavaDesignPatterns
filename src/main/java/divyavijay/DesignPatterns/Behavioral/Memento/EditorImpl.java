package divyavijay.DesignPatterns.Behavioral.Memento;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class EditorImpl implements Editor {

	String content;

	@Override
	public Memento saveSanpshot() {
		return new EditorSnapshot(this, this.content);
	}
	
	@Override
	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String getContent() {
		return this.content;
	}
}

