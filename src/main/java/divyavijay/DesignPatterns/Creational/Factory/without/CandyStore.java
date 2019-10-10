package divyavijay.DesignPatterns.Creational.Factory.without;

import java.util.List;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class CandyStore {

	public static void main(String[] args) {
		
	}
	
	/**
	 * Problems
	 * 1. If new candies are added or removed getCandy needs to be changed.
	 * 2. If there are a lot of candy types this method will be huge.
	 */
	public Candy getCandy(String type) {
		if(type.equals("chocolate"))
			return new Chocolate();
		else
			return new HardCandy();
	}
	
	/**
	 * Problems
	 * 1. If makeCandyPackage method changes then getCandyPackage needs to change.
	 */
	public List<Candy> getCandyPackage(String type, int quantity) {
		Candy candy = getCandy(type);
		return candy.makeCandyPackage(quantity);
	}
}
