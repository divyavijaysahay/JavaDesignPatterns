package divyavijay.DesignPatterns.Android.FragmentAction;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class ChildFragment {

	private OnChildFramentClick childFramentClick;
	
	public ChildFragment(OnChildFramentClick childFramentClick) {
		this.childFramentClick = childFramentClick;
	}
	
	public interface OnChildFramentClick {
		public void onChildFragmentClickListener(String result);
	}
	
	private void run(String result) {
		this.childFramentClick.onChildFragmentClickListener(result);
	}
	
	public void click(String result) {
		System.out.println(this.getClass().getSimpleName() + " Loaded.");
		run(result);
	}
	
}
