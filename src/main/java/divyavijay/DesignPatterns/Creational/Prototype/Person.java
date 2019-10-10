package divyavijay.DesignPatterns.Creational.Prototype;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class Person implements Cloneable {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public Person clone() {
		try {
			return (Person) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}
	
	@Override
	public String toString() {
		return getName();
	}
	
}
