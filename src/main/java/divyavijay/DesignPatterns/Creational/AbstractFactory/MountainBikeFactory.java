package divyavijay.DesignPatterns.Creational.AbstractFactory;

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

}
