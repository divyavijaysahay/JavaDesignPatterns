package divyavijay.DesignPatterns.Creational.Factory.with.basic;

import java.util.List;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public class CandyStore {

	private static final CandyFactory candyFactory = new CandyFactory();
	
	public static void main(String[] args) {
		
		List<Candy> candies = candyFactory.getCandyPackage("chocolate", 10);
	}
	
}
