package divyavijay.DesignPatterns.Behavioral.template;

/**
 * @Date : Oct 23, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class Client1 extends Base {

	@Override
	public void step2() {
		System.out.println(getClass().getSimpleName() + " Step2.");
	}

	@Override
	public void step3() {
		System.out.println(getClass().getSimpleName() + " Step3.");
	}

}
