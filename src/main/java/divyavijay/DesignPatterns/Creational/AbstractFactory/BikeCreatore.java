package divyavijay.DesignPatterns.Creational.AbstractFactory;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay
 */

public class BikeCreatore {

	public static void main(String[] args) {
		createBikeWithoutFactory(BikeType.MOUNTAIN);
		createBikeWithFactory(BikeType.MOUNTAIN);
	}

	private static void createBikeWithFactory(BikeType bikeType) {
		BikeFactory bikeFactory = FactoryCreator.createFactory(bikeType);
		Tire tire = bikeFactory.createTire();
		System.out.println(tire.getDescription());
	}

	private static void createBikeWithoutFactory(BikeType type) {
		BikeFactory bikeFactory = null;
		switch (type) {
		case MOUNTAIN:
			bikeFactory = new MountainBikeFactory();
			break;
		default:
			bikeFactory = new RoadBikeFactory();
		}
		Tire tire = bikeFactory.createTire();
		System.out.println(tire.getDescription());
	}

}
