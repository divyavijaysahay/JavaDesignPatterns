package divyavijay.DesignPatterns.Creational.Factory.with.complete.factory;

import java.util.List;

import divyavijay.DesignPatterns.Creational.Factory.with.complete.POJO.Candy;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay
 */

public abstract class CandyFactory {

	public abstract Candy getCandy(String type);

	public List<Candy> getCandyPackage(String type, int quantity) {
		Candy candy = getCandy(type);
		return candy.makeCandyPackage(quantity);
	}
}
