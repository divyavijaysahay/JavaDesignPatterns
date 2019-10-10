package divyavijay.DesignPatterns.Creational.Prototype;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class App {

	public static void main(String[] args) {
		Rabbit rabbit1 = new Rabbit();
		rabbit1.setAge(24);
		rabbit1.setOwner(new Person("Jack"));
		Rabbit rabbit2 = rabbit1.clone();
		System.out.println(rabbit1.getOwner());
		System.out.println(rabbit2.getOwner());
		
		rabbit2.getOwner().setName("Jill");
		System.out.println(rabbit1.getOwner());
		System.out.println(rabbit2.getOwner());
	}
	
}
