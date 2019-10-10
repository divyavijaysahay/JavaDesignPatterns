package divyavijay.DesignPatterns.Creational.Factory.without;

import java.util.List;

/**
 * @Date : Oct 9, 2019
 *
 * @Author: Divyavijay Sahay  
 */

public abstract class Candy {

	abstract List<Candy> makeCandyPackage(int quantity);
	
}
