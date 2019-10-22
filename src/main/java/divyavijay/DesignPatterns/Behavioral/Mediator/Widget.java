package divyavijay.DesignPatterns.Behavioral.Mediator;

import java.util.UUID;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public abstract class Widget implements WidgetActions {
	
	private String name;
	private UUID uuid;
	
	public Widget(String name) {
		this.name = name;
		this.uuid = UUID.randomUUID();
	}
	
	public String getId() {
		return this.uuid.toString();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void setOnClickListener(OnClickListener onClickListener);
}
