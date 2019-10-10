package divyavijay.DesignPatterns.Creational.AbstractFactory.extensible;

import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.BikePart;
import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.BikePartType;
import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.RoadBikeHandle;
import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.RoadBikeTire;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class RoadBikeFactory extends ExtensibleBikeFactory {

	@Override
	public BikePart create(BikePartType bikePartType) {
		switch (bikePartType) {
		case TIRE:
			return new RoadBikeTire();
		case HANDLE:
			return new RoadBikeHandle();
		default:
			return new RoadBikeHandle();
		}
	}

}
