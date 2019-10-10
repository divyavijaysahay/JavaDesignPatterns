package divyavijay.DesignPatterns.Creational.AbstractFactory;

import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.BikePartType;
import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.BikeType;
import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.Handle;
import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.MountainBikeHandle;
import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.MountainBikeTire;
import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.RoadBikeHandle;
import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.RoadBikeTire;
import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.Tire;
import divyavijay.DesignPatterns.Creational.AbstractFactory.extensible.ExtensibleBikeFactory;
import divyavijay.DesignPatterns.Creational.AbstractFactory.extensible.ExtensibleFactoryCreator;
import divyavijay.DesignPatterns.Creational.AbstractFactory.factory.BikeFactory;
import divyavijay.DesignPatterns.Creational.AbstractFactory.factory.FactoryCreator;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay
 */

public class BikeCreatore {

	public static void main(String[] args) {
		createBikeWithoutFactory(BikeType.MOUNTAIN);
		createBikeWithFactory(BikeType.MOUNTAIN);
		createBikeWithExtensibleFactory(BikeType.MOUNTAIN);
	}

	private static void createBikeWithExtensibleFactory(BikeType bikeType) {
		ExtensibleBikeFactory bikeFactory = ExtensibleFactoryCreator.createFactory(bikeType);
		Tire tire = (Tire) bikeFactory.create(BikePartType.TIRE);
		Handle handle = (Handle) bikeFactory.create(BikePartType.HANDLE);
		System.out.println(tire.getDescription());
		System.out.println(handle.getDescription());
	}

	private static void createBikeWithFactory(BikeType bikeType) {
		BikeFactory bikeFactory = FactoryCreator.createFactory(bikeType);
		Tire tire = bikeFactory.createTire();
		Handle handle = bikeFactory.createHandle();
		
		System.out.println(tire.getDescription());
		System.out.println(handle.getDescription());
	}

	private static void createBikeWithoutFactory(BikeType type) {
		if(type == BikeType.MOUNTAIN) {
			Tire tire = new MountainBikeTire();
			Handle handle = new MountainBikeHandle();

			System.out.println(tire.getDescription());
			System.out.println(handle.getDescription());
		} else {
			Tire tire = new RoadBikeTire();
			Handle handle = new RoadBikeHandle();

			System.out.println(tire.getDescription());
			System.out.println(handle.getDescription());
		}
	}

}
