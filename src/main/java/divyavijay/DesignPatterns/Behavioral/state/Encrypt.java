package divyavijay.DesignPatterns.Behavioral.state;

/**
 * @Date : Oct 22, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class Encrypt implements State {

	@Override
	public void process(Context context) {
		String content = context.getContent();
		context.setContent(encrypt(content));
	}

	private String encrypt(String content) {
		char[] vals = content.toCharArray();
		for(int i = 0; i<vals.length; i++) {
			vals[i] = (char) (vals[i] + 10);
		}
			
		return new String(vals);
	}

}
