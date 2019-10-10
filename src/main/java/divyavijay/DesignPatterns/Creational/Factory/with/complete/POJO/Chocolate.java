package divyavijay.DesignPatterns.Creational.Factory.with.complete.POJO;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay
 */

public class Chocolate extends Candy {

	@Override
	public List<Candy> makeCandyPackage(int quantity) {
		List<Candy> chocolates = new ArrayList<>();
		System.out.println(quantity + " packages of chocolate created.");
		while (quantity > 0) {
			chocolates.add(new Chocolate());
			quantity--;
		}		
		return chocolates;
	}

}
