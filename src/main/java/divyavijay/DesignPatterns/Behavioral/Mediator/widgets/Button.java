package divyavijay.DesignPatterns.Behavioral.Mediator.widgets;

import divyavijay.DesignPatterns.Behavioral.Mediator.OnClickListener;
import divyavijay.DesignPatterns.Behavioral.Mediator.Widget;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class Button extends Widget {

	private OnClickListener onClickListener;
	
	public Button(String name) {
		super(name);
	}
	
	@Override
	public void click() {
		this.onClickListener.onClick(this.getId());
	}

	@Override
	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}

}
