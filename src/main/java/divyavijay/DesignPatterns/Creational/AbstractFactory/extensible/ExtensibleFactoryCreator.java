package divyavijay.DesignPatterns.Creational.AbstractFactory.extensible;

import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.BikeType;
import divyavijay.DesignPatterns.Creational.AbstractFactory.extensible.ExtensibleBikeFactory;
import divyavijay.DesignPatterns.Creational.AbstractFactory.extensible.MountainBikeFactory;
import divyavijay.DesignPatterns.Creational.AbstractFactory.extensible.RoadBikeFactory;

/**
 * @Date : Oct 10, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class ExtensibleFactoryCreator {

	public static ExtensibleBikeFactory createFactory(BikeType bikeType) {
		switch (bikeType) {
		case MOUNTAIN:
			return new MountainBikeFactory();
		default:
			return new RoadBikeFactory();
		}
	}
	
}
