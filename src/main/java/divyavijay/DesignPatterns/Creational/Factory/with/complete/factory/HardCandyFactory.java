package divyavijay.DesignPatterns.Creational.Factory.with.complete.factory;

import java.util.List;

import divyavijay.DesignPatterns.Creational.Factory.with.complete.POJO.Candy;
import divyavijay.DesignPatterns.Creational.Factory.with.complete.POJO.Lollipop;
import divyavijay.DesignPatterns.Creational.Factory.with.complete.POJO.PeperMint;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay
 */

public class HardCandyFactory extends CandyFactory {

	public HardCandyFactory() {
	}
	
	@Override
	public Candy getCandy(String type) {
		switch (type) {
		case "lollipop":
			return new Lollipop();
		default:
			return new PeperMint();
		}
	}

	@Override
	public List<Candy> getCandyPackage(String type, int quantity) {
		if (quantity % 10 != 0) {
			System.out.println("Hard cany has to be in the multiple of 10.");
			return null;
		}

		Candy candy = getCandy(type);
		return candy.makeCandyPackage(quantity);
	}

}
