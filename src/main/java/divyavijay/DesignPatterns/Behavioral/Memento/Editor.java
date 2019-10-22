package divyavijay.DesignPatterns.Behavioral.Memento;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public interface Editor {
	public void setContent(String content);
	public String getContent();
	public Memento saveSanpshot();
}
