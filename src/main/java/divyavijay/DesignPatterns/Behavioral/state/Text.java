package divyavijay.DesignPatterns.Behavioral.state;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class Text implements State{

	@Override
	public void process(Context context) {
		context.setContent(context.getContent().trim());
	}

}
