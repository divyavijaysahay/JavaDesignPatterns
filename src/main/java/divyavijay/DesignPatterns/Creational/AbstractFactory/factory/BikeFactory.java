package divyavijay.DesignPatterns.Creational.AbstractFactory.factory;

import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.Handle;
import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.Tire;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public abstract class BikeFactory {
	public abstract Tire createTire();
	public abstract Handle createHandle();
}
