package divyavijay.DesignPatterns.Creational.Prototype;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay
 */

public class Rabbit implements Cloneable {

	private String name;
	private int age;
	private Person owner;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	@Override
	public Rabbit clone() {
		try {
			Rabbit rabbit = (Rabbit) super.clone();
			// This step handle mutable Person object. Otherwise all the copies of rabbit will point to same person.
			rabbit.setOwner(owner.clone());
			return rabbit;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}

}
