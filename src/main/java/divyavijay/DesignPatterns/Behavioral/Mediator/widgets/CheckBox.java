package divyavijay.DesignPatterns.Behavioral.Mediator.widgets;

import divyavijay.DesignPatterns.Behavioral.Mediator.OnClickListener;
import divyavijay.DesignPatterns.Behavioral.Mediator.Widget;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class CheckBox extends Widget {

	private OnClickListener clickListener;
	private boolean isSelected;
	
	public CheckBox(String name) {
		super(name);
		this.isSelected = false;
	}

	public boolean isSelected() {
		return this.isSelected;
	}
	
	public void select() {
		this.isSelected = !this.isSelected;
	}
	
	@Override
	public void click() {
		select();
		this.clickListener.onClick(getId());
	}

	@Override
	public void setOnClickListener(OnClickListener onClickListener) {
		this.clickListener = onClickListener;
	}

}
