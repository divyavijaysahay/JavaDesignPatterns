package divyavijay.DesignPatterns.Creational.AbstractFactory;

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

}
