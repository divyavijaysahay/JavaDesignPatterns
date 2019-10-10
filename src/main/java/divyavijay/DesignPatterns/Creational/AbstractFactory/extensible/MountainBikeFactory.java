package divyavijay.DesignPatterns.Creational.AbstractFactory.extensible;

import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.BikePart;
import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.BikePartType;
import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.MountainBikeHandle;
import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.MountainBikeTire;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class MountainBikeFactory extends ExtensibleBikeFactory {

	@Override
	public BikePart create(BikePartType bikePartType) {
		switch (bikePartType) {
		case TIRE:
			return new MountainBikeTire();
		case HANDLE:
			return new MountainBikeHandle();
		default:
			return new MountainBikeHandle();
		}
	}

}
