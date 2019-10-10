package divyavijay.DesignPatterns.Creational.Factory.without;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay
 */

public class Chocolate extends Candy {

	@Override
	List<Candy> makeCandyPackage(int quantity) {
		List<Candy> chocolates = new ArrayList<Candy>();
		while (quantity > 0) {
			chocolates.add(new Chocolate());
			quantity--;
		}
		return chocolates;
	}

}
