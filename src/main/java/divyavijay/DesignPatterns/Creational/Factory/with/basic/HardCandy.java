package divyavijay.DesignPatterns.Creational.Factory.with.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay
 */

public class HardCandy extends Candy {

	@Override
	List<Candy> makeCandyPackage(int quantity) {
		List<Candy> hardCandies = new ArrayList<Candy>();
		while (quantity > 0) {
			hardCandies.add(new HardCandy());
			quantity--;
		}
		return hardCandies;
	}

}
