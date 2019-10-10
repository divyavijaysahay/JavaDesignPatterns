package divyavijay.DesignPatterns.Creational.Factory.with.complete;

import divyavijay.DesignPatterns.Creational.Factory.with.complete.factory.ChocolateFactory;
import divyavijay.DesignPatterns.Creational.Factory.with.complete.factory.HardCandyFactory;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay
 */

public class CandyStore {

	public static void main(String[] args) {

		ChocolateFactory chocolateFactory = new ChocolateFactory();
		HardCandyFactory hardCandyFactory = new HardCandyFactory();
		
		chocolateFactory.getCandyPackage("milk", 10);
		hardCandyFactory.getCandyPackage("perpermint", 14);
		hardCandyFactory.getCandyPackage("lollipop", 50);
	}

}
