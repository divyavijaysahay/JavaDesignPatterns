package divyavijay.DesignPatterns.Behavioral.template;

/**
 * @Date : Oct 23, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public abstract class Base {

	public void template() {
		step1();
		step2();
		step3();
	}

	public void step1() {
		System.out.println("Base Step1.");
	}

	public abstract void step2();
	public abstract void step3();
}
