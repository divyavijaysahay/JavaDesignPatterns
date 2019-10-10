package divyavijay.DesignPatterns.Creational.AbstractFactory;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay
 */

public class FactoryCreator {

	public static BikeFactory createFactory(BikeType bikeType) {
		switch (bikeType) {
		case MOUNTAIN:
			return new MountainBikeFactory();
		default:
			return new RoadBikeFactory();
		}
	}

}
