package divyavijay.DesignPatterns.Creational.AbstractFactory.extensible;

import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.BikePart;
import divyavijay.DesignPatterns.Creational.AbstractFactory.POJO.BikePartType;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public abstract class ExtensibleBikeFactory {
	public abstract BikePart create(BikePartType bikePartType);
}
