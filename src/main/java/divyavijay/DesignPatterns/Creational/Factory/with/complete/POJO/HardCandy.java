package divyavijay.DesignPatterns.Creational.Factory.with.complete.POJO;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay
 */

public class HardCandy extends Candy {

	@Override
	public List<Candy> makeCandyPackage(int quantity) {
		List<Candy> hardCandies = new ArrayList<>();
		System.out.println(quantity/10 + " total packages created.");
		while (quantity > 0) {
			hardCandies.add(new HardCandy());
			quantity--;
		}				
		return hardCandies;
	}

}
