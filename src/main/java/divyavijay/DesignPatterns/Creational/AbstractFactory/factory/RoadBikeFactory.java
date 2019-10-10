package divyavijay.DesignPatterns.Creational.AbstractFactory.factory;

import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.Handle;
import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.RoadBikeHandle;
import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.RoadBikeTire;
import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.Tire;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class RoadBikeFactory extends BikeFactory {

	@Override
	public Tire createTire() {
		return new RoadBikeTire();
	}

	@Override
	public Handle createHandle() {
		return new RoadBikeHandle();
	}

}
