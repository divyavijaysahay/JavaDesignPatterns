package divyavijay.DesignPatterns.Creational.Factory.with.basic;

import java.util.List;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class CandyFactory {

	public Candy getCandy(String type) {
		if(type.equals("chocolate"))
			return new Chocolate();
		else
			return new HardCandy();
	}
	
	public List<Candy> getCandyPackage(String type, int quantity) {
		Candy candy = getCandy(type);
		return candy.makeCandyPackage(quantity);
	}
}
