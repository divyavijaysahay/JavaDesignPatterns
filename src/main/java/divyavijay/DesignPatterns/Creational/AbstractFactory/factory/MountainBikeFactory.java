package divyavijay.DesignPatterns.Creational.AbstractFactory.factory;

import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.Handle;
import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.MountainBikeHandle;
import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.MountainBikeTire;
import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.Tire;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class MountainBikeFactory extends BikeFactory {

	@Override
	public Tire createTire() {
		return new MountainBikeTire();
	}

	@Override
	public Handle createHandle() {
		return new MountainBikeHandle();
	}

}
