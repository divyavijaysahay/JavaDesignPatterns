package divyavijay.DesignPatterns.Creational.Factory.with.complete.factory;

import divyavijay.DesignPatterns.Creational.Factory.with.complete.POJO.Candy;
import divyavijay.DesignPatterns.Creational.Factory.with.complete.POJO.DarkChocolate;
import divyavijay.DesignPatterns.Creational.Factory.with.complete.POJO.MilkChocolate;
import divyavijay.DesignPatterns.Creational.Factory.with.complete.POJO.WhiteChocolate;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay
 */

public class ChocolateFactory extends CandyFactory {

	public ChocolateFactory() {
	}

	@Override
	public Candy getCandy(String type) {
		switch (type) {
		case "dark":
			return new DarkChocolate();
		case "white":
			return new WhiteChocolate();
		default:
			return new MilkChocolate();
		}
	}

}
