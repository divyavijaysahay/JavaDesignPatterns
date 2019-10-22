package divyavijay.DesignPatterns.Android.FragmentAction;

import divyavijay.DesignPatterns.Android.FragmentAction.ChildFragment.OnChildFramentClick;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class Activity implements OnChildFramentClick {

	private ChildFragment childFragment;
	
	public Activity() {
		this.childFragment = new ChildFragment(this);		
	}
	
	public void display(String result) {
		this.childFragment.click(result);
	}
	
	@Override
	public void onChildFragmentClickListener(String result) {
		System.out.println(this.getClass().getSimpleName() + " received: " + result);
	}

}
